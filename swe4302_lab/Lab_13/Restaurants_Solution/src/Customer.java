import static java.lang.Thread.sleep;
import java.util.Queue;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Customer extends Thread {
    private static int nextCustomerId = 0;
    public final int customerId;
    private final Queue<Order> orderQueue;
    private final Receptionist receptionist;
    Random random;
    int tableAssigned;
    private Order order;

    public Customer(Queue<Order> orderQueue, Receptionist receptionist) {
        this.customerId = nextCustomerId++;
        this.orderQueue = orderQueue;
        this.receptionist = receptionist;
        random = new Random();
    }

    @Override
    public void run() {
        try {
            arrive();
            getTable();
            placeOrder();
            eat();
            leave();
        } catch (InterruptedException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void arrive() throws InterruptedException {
        sleep(random.nextInt(5000));
        System.out.println("Customer " + customerId + " is entering the restaurant.");
    }

    private void getTable() throws InterruptedException {
        System.out.println("Customer " + customerId + " requesting for table.");
        this.tableAssigned = receptionist.requestTable(this);
        System.out.println("Customer " + customerId + " has been assigned table no: " + tableAssigned);
    }

    private void placeOrder() throws InterruptedException {
        sleep(random.nextInt(2000));
        String[] menu = { "Burger", "Pizza", "Pasta" };
        String meal = menu[random.nextInt(3)];
        this.order = new Order(meal, this);
        orderQueue.add(this.order);
        System.out.println("Customer " + customerId + " has placed an order of " + meal);
    }

    private void eat() throws InterruptedException {
        order.getFood();
        System.out.println("Customer " + customerId + " eating meal.");
        sleep(random.nextInt(2000) + 3000);
        System.out.println("Customer " + customerId + " finished eating.");
    }

    private void leave() throws InterruptedException {
        sleep(random.nextInt(2000));
        System.out.println("Customer " + customerId + " is leaving the restaurant from table " + this.tableAssigned);
        // release table
        receptionist.customerLeaving(this.tableAssigned);
    }
}