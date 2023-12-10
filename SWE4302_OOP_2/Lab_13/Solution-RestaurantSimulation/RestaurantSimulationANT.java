package restaurantsimulationant;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RestaurantSimulationANT {
        public static void main(String[] args) throws InterruptedException {

                int numCustomers = 10;
                int numTables = 5;
                // int numChefs = 2;
                // int numWaiters = 3;

                Queue<Order> orderQueue = new LinkedList<>();
                Queue<Order> cookedFoodQueue = new LinkedList<>();

                // List<Thread> chefThreads = new ArrayList<>();
                // List<Thread> waiterThreads = new ArrayList<>();
                List<Thread> customerThreads = new ArrayList<>();

                Receptionist receptionist = new Receptionist(numTables, orderQueue, cookedFoodQueue, numCustomers);
                receptionist.start();

                // //Chefs
                // for (int i = 0; i < numChefs; i++) {
                // Chef chef = new Chef(orderQueue, cookedFoodQueue);
                // chefThreads.add(chef);
                // chef.start();
                // }
                //
                // // Waiters
                // for (int i = 0; i < numWaiters; i++) {
                // Waiter waiter = new Waiter(cookedFoodQueue);
                // waiterThreads.add(waiter);
                // waiter.start();
                // }

                // Customers
                for (int i = 0; i < numCustomers; i++) {
                        Customer customer = new Customer(orderQueue, receptionist);
                        customerThreads.add(customer);
                        customer.start();
                }

                // Wait for all threads to finish
                for (Thread t : customerThreads) {
                        t.join();
                }

                // for(Thread t : chefThreads){
                // t.join();
                // }
                // for(Thread t : waiterThreads){
                // t.join();
                // }

                receptionist.join();

                System.out.println("All customers served. Restaurant closing.");
        }
}
