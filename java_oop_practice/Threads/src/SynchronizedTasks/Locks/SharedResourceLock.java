package SynchronizedTasks.Locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SharedResourceLock implements Runnable{
    private int counter = 0;
    private final Lock lock = new ReentrantLock();


    private void increment() {
        lock.lock();
        try {
            counter++;
            System.out.println("Incremented counter to: " + counter);
        } finally {
            lock.unlock();
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            increment();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
