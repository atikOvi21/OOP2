//import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Receptionist extends Thread {

    private int customerServed = 0;
    private final int numCustomers;

    private final int numTables;
    private int tableBooked = 0;
    private final Table[] tables;

    Queue<Order> orderQueue = new LinkedList<>();
    Queue<Order> cookedFoodQueue = new LinkedList<>();
    Random random;

    public Receptionist(int numTables, Queue<Order> orderQueue, Queue<Order> cookedFoodQueue, int numCustomers) {

        this.numTables = numTables;
        this.tables = new Table[numTables];
        for (int i = 0; i < numTables; i++) {
            tables[i] = new Table();
        }

        this.orderQueue = orderQueue;
        this.cookedFoodQueue = cookedFoodQueue;
        this.numCustomers = numCustomers;
        random = new Random();

    }

    @Override
    public void run() {
        while (true) {
            try {
                assignTable();
                sleep(random.nextInt(200) + 200);

                // handle orders
                if (!orderQueue.isEmpty()) {
                    Chef chef = new Chef(this.orderQueue, this.cookedFoodQueue);
                    chef.start();
                    Waiter waiter = new Waiter(this.cookedFoodQueue, chef);
                    waiter.start();

                }

                // terminate if all served
                if (allServed()) {
                    System.out.println("All Served. Stopping.");
                    break;
                }

            } catch (InterruptedException ex) {

                System.out.println(ex.getMessage());
            }

        }
    }

    public synchronized int requestTable(Customer customer) throws InterruptedException {

        wait();

        // if available table found, assign them.
        int i = 0;
        for (i = 0; i < numTables; i++) {
            if (!tables[i].isBooked) {
                tables[i].isBooked = true;
                tables[i].customer = customer;
                tableBooked++;
                break;
            }
        }
        return i;
    }

    private synchronized void assignTable() {
        if (tableBooked < numTables) {
            notify();
        }

    }

    public void customerLeaving(int tableNo) {
        // release table
        tables[tableNo].isBooked = false;
        tables[tableNo].customer = null;
        this.customerServed++;
        tableBooked--;
    }

    private boolean allServed() {
        return customerServed == numCustomers;
    }

}