import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class CookedFoodQueue implements SharedQueue<String> {
    private final BlockingQueue<String> cookedFoodQueue;

    public CookedFoodQueue(int size) {
        this.cookedFoodQueue = new ArrayBlockingQueue<>(size);
    }

    @Override
    public void addToQueue(String item) throws InterruptedException {
        cookedFoodQueue.put(item);
        System.out.println("Cooked food placed: " + item);
    }

    @Override
    public String removeFromQueue() throws InterruptedException {
        String cookedFood = cookedFoodQueue.take();
        System.out.println("Cooked food being served: " + cookedFood);
        return cookedFood;
    }
}
