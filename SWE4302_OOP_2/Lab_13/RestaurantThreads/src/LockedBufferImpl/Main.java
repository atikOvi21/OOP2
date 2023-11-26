package LockedBufferImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {
        int numTables = 5;
        int numChefs = 3;
        int numWaiters = 2;
        int numCustomers = 10;

        BlockingQueue<String> orderQueue = new ArrayBlockingQueue<>(10);
        BlockingQueue<String> cookedFoodQueue = new ArrayBlockingQueue<>(10);
        Lock lock = new ReentrantLock();
        Condition orderPlacedCondition = lock.newCondition();

        List<Thread> threads = new ArrayList<>();

        for (int i = 0; i < numCustomers; i++) {
            threads.add(new Customer(orderQueue, lock, orderPlacedCondition));
        }

        for (int i = 0; i < numChefs; i++) {
            threads.add(new Chef(orderQueue, cookedFoodQueue, lock, orderPlacedCondition));
        }

        for (int i = 0; i < numWaiters; i++) {
            threads.add(new Waiter(cookedFoodQueue, lock));
        }

        threads.add(new Receptionist(orderQueue, lock, orderPlacedCondition));

        for (Thread thread : threads) {
            thread.start();
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                System.out.println(thread.getName() + " was interrupted.");
            }
        }
    }
}
