public class Waiter extends Thread {
  private static int waiterNumber = 1;
  private final int waiterId;
  private final SharedQueue<String> cookedFoodQueue;

  public Waiter(SharedQueue<String> cookedFoodQueue) {
    this.waiterId = waiterNumber++;
    this.cookedFoodQueue = cookedFoodQueue;
  }

  @Override
    public void run() {
        while(!Thread.interrupted()) {
            try {
                String cookedDish = cookedFoodQueue.removeFromQueue();
                System.out.println(STR."Waiter \{waiterId} is serving \{cookedDish}");
            } catch (InterruptedException e) {
                System.out.println(STR."Waiter \{waiterId} Interrupted!!");
            }
        }
    }
}
