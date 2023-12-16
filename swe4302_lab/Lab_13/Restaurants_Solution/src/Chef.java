import static java.lang.Thread.sleep;
import java.util.Queue;
import java.util.Random;

public class Chef extends Thread {
    private static int nextChefId = 0;
    private final int chefId;
    private final Queue<Order> orderQueue;
    private final Queue<Order> cookedFoodQueue;
    Random random;

    public Chef(Queue<Order> orderQueue, Queue<Order> cookedFoodQueue) {
        this.chefId = nextChefId++;
        this.orderQueue = orderQueue;
        this.cookedFoodQueue = cookedFoodQueue;
        random = new Random();
    }

    @Override
    public void run() {
        if (!orderQueue.isEmpty()) {
            Order order = orderQueue.poll();
            System.out.println("Chef " + chefId + " is preparing order for Customer: " + order.customer.customerId);

            // Simulate cooking time
            try {
                sleep(random.nextInt(3000) + 2000);
            } catch (InterruptedException e) {
                System.out.printf(e.getMessage());
            }

            cookedFoodQueue.add(order);
            System.out.println("Chef " + chefId + " has prepared " + order.customer.customerId);
        }
    }
}
