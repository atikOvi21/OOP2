package Locksss;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SynchronizedBuffer implements Buffer{
    private final Lock accessLock = new ReentrantLock();
    private final Condition canWrite = accessLock.newCondition();
    private final Condition canRead = accessLock.newCondition();

    private int buffer = -1;
    private boolean occupied = false;

    @Override
    public void set(int value) throws InterruptedException {
        accessLock.lock();

        try {
            while (occupied) {
                System.out.println("LockProducer tries to write.");
                displayState("Buffer full. LockProducer waits.");
                canWrite.await();
            }

            buffer = value;
            occupied = true;
            displayState("LockProducer writes " + buffer);
            canRead.signal();
        } finally {
            accessLock.unlock();
        }
    }

    @Override
    public int get() throws InterruptedException {
        int readValue = 0;
        accessLock.lock();

        try {
            while (!occupied) {
                System.out.println("LockConsumer tries to read.");
                displayState("Buffer empty. LockConsumer waits.");
                canRead.await();
            }

            occupied = false;
            readValue = buffer;
            displayState("LockConsumer reads " + readValue);
            canWrite.signal();
        } finally {
            accessLock.unlock();
        }

        return readValue;
    }

    public void displayState(String operation) {
        System.out.printf("%-40s%d\t\t%b%n%n", operation, buffer, occupied);
    }
}
