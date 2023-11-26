package LockedBufferImpl;

import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Receptionist extends Thread {
    private final BlockingQueue<String> orderQueue;
    private final Lock lock;
    private final Condition orderPlacedCondition;

    public Receptionist(BlockingQueue<String> orderQueue, Lock lock, Condition orderPlacedCondition) {
        this.orderQueue = orderQueue;
        this.lock = lock;
        this.orderPlacedCondition = orderPlacedCondition;
    }

    @Override
    public void run() {
        while (true) {
            try {
                lock.lock();
                while (orderQueue.isEmpty()) {
                    lock.wait(); // Wait for orders to be placed.
                }
                orderPlacedCondition.signalAll(); // Signal customers that orders are placed.
            } catch (InterruptedException e) {
                System.out.println("Receptionist was interrupted.");
            } finally {
                lock.unlock();
            }
        }
    }
}