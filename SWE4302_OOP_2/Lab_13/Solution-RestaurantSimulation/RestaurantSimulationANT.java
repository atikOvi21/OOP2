package restaurantsimulationant;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RestaurantSimulationANT {
        public static void main(String[] args) throws InterruptedException {

                int numCustomers = 10;
                int numTables = 5;

                Queue<Order> orderQueue = new LinkedList<>();
                Queue<Order> cookedFoodQueue = new LinkedList<>();

                List<Thread> customerThreads = new ArrayList<>();

                Receptionist receptionist = new Receptionist(numTables, orderQueue, cookedFoodQueue, numCustomers);
                receptionist.start();

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

                receptionist.join();

                System.out.println("All customers served. Restaurant closing.");
        }
}
