package restaurantsimulationant;

import static java.lang.Thread.sleep;
import java.util.Queue;
import java.util.Random;

public class Waiter extends Thread {
    private static int nextWaiterId = 0;
    private final int waiterId;
    private Queue<Order> cookedFoodQueue;
    Chef chef;
    Random random;

    public Waiter(Queue<Order> cookedFoodQueue, Chef chef) {
        this.waiterId = nextWaiterId++;
        this.cookedFoodQueue = cookedFoodQueue;
        this.chef = chef;
        this.random = new Random();
    }

    @Override
    public void run() {
        try {
            this.chef.join();
            if (!cookedFoodQueue.isEmpty()) {
                Order order = cookedFoodQueue.poll();
                System.out.println("Waiter " + waiterId + " is serving ");

                // Simulate serving time
                sleep(random.nextInt(200) + 700);
                order.serveFood();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}