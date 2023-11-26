package LockedBufferImpl;

import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

class Customer extends Thread {
    private static int customerIdCounter = 1;
    private final int customerId;
    private final BlockingQueue<String> orderQueue;
    private final Lock lock;
    private final Condition orderPlacedCondition;

    public Customer(BlockingQueue<String> orderQueue, Lock lock, Condition orderPlacedCondition) {
        this.customerId = customerIdCounter++;
        this.orderQueue = orderQueue;
        this.lock = lock;
        this.orderPlacedCondition = orderPlacedCondition;
    }

    @Override
    public void run() {
        try {
            lock.lock();
            System.out.println("Customer " + customerId + " is placing an order.");
            List<String> dishes = List.of("Burger", "Pizza", "Pasta");
            for (String dish : dishes) {
                orderQueue.put(dish);
                System.out.println("Customer " + customerId + " ordered: " + dish);
            }
            orderPlacedCondition.signal(); // Signal chefs that order is placed.
        } catch (InterruptedException e) {
            System.out.println("Customer " + customerId + " was interrupted.");
        } finally {
            lock.unlock();
        }

        // Customer waiting for food
        try {
            lock.lock();
            System.out.println("Customer " + customerId + " is waiting for the food.");
            orderPlacedCondition.await(); // Wait for the receptionist to assign a table.
        } catch (InterruptedException e) {
            System.out.println("Customer " + customerId + " was interrupted.");
        } finally {
            lock.unlock();
        }
    }
}