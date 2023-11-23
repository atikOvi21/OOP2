import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int numTables = 6;
        int numChefs = 2;
        int numWaiters = 1;
        int numCustomersToServe = 5;

        List<String> menuItems = List.of("Burger", "Pizza", "Pasta", "Salad", "Steak");
        Menu menu = new Menu(menuItems);

        SharedQueue<String> orderQueue = new OrderQueue(5);
        SharedQueue<String> cookedFoodQueue = new CookedFoodQueue(5);

        Receptionist receptionist = new Receptionist(numTables);

        List<Thread> threads = new ArrayList<>();

        for (int i = 0; i < numCustomersToServe; i++) {
            Customer customer = new Customer(orderQueue, menu, receptionist);
            threads.add(customer);
            customer.start();
        }

        for (int i = 0; i < numChefs; i++) {
            Chef chef = new Chef(orderQueue, cookedFoodQueue);
            threads.add(chef);
            chef.start();
        }

        for (int i = 0; i < numWaiters; i++) {
            Waiter waiter = new Waiter(cookedFoodQueue);
            threads.add(waiter);
            waiter.start();
        }

        threads.forEach(thread -> {
            try {
                thread.join();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        });

        System.out.println("--------------------------------------------------");
        System.out.println("All customers served.");
        System.out.println("Simulation complete.");
    }
}