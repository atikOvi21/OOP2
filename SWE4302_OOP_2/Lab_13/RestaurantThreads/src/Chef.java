import java.util.concurrent.BlockingQueue;

public class Chef extends Thread {

  private final SharedQueue<String> orderQueue;
  private final SharedQueue<String> cookedFoodQueue;

  public Chef(SharedQueue<String> orderQueue, SharedQueue<String> cookedFoodQueue) {
    this.chefId = chefNumber++;
    this.orderQueue = orderQueue;
    this.cookedFoodQueue = cookedFoodQueue;
  }

  @Override
    public void run(){
        while(!Thread.interrupted()) {
            try {
                String orderedDish = orderQueue.removeFromQueue();

                System.out.println(STR."Chef \{chefId} is cooking \{orderedDish}");
                Thread.sleep((long) (Math.random() * 1000));

                cookedFoodQueue.addToQueue(orderedDish);
                System.out.println(STR."Chef \{chefId} cooked \{orderedDish}");

            } catch (InterruptedException e) {
                System.out.println(STR."Chef \{chefId} Interrupted!!");
            }
        }
    }
}
