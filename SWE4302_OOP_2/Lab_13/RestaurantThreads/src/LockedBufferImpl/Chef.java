package LockedBufferImpl;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

class Chef extends Thread {
    private static int chefIdCounter = 1;
    private final int chefId;
    private final BlockingQueue<String> orderQueue;
    private final BlockingQueue<String> cookedFoodQueue;
    private final Lock lock;
    private final Condition orderPlacedCondition;

    public Chef(BlockingQueue<String> orderQueue, BlockingQueue<String> cookedFoodQueue,
                Lock lock, Condition orderPlacedCondition) {
        this.chefId = chefIdCounter++;
        this.orderQueue = orderQueue;
        this.cookedFoodQueue = cookedFoodQueue;
        this.lock = lock;
        this.orderPlacedCondition = orderPlacedCondition;
    }

    @Override
    public void run() {
        while (true) {
            try {
                lock.lock();
                while (orderQueue.isEmpty()) {
                    orderPlacedCondition.await(); // Wait for orders to be placed.
                }
                String dish = orderQueue.take();
                System.out.println("Chef " + chefId + " is preparing " + dish);
                // Simulate cooking time
                Thread.sleep(2000);
                cookedFoodQueue.put(dish);
                System.out.println("Chef " + chefId + " finished preparing " + dish);
            } catch (InterruptedException e) {
                System.out.println("Chef " + chefId + " was interrupted.");
            } finally {
                lock.unlock();
            }
        }
    }
}