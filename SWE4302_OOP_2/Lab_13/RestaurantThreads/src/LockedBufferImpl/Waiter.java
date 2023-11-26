package LockedBufferImpl;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.locks.Lock;

class Waiter extends Thread {
    private static int waiterIdCounter = 1;
    private final int waiterId;
    private final BlockingQueue<String> cookedFoodQueue;
    private final Lock lock;

    public Waiter(BlockingQueue<String> cookedFoodQueue, Lock lock) {
        this.waiterId = waiterIdCounter++;
        this.cookedFoodQueue = cookedFoodQueue;
        this.lock = lock;
    }

    @Override
    public void run() {
        while (true) {
            try {
                lock.lock();
                while (cookedFoodQueue.isEmpty()) {
                    lock.wait(); // Wait for food to be cooked.
                }
                String dish = cookedFoodQueue.take();
                System.out.println("Waiter " + waiterId + " is serving " + dish);
            } catch (InterruptedException e) {
                System.out.println("Waiter " + waiterId + " was interrupted.");
            } finally {
                lock.unlock();
            }
        }
    }
}