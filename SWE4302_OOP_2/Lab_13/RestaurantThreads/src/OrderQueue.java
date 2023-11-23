import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class OrderQueue implements SharedQueue<String> {
    private final BlockingQueue<String> orderQueue;

    public OrderQueue(int size) {
        this.orderQueue = new ArrayBlockingQueue<>(size);
    }

    @Override
    public void addToQueue(String item) throws InterruptedException {
        orderQueue.put(item);
        System.out.println(STR."Order placed: \{item}");
    }

    @Override
    public String removeFromQueue() throws InterruptedException {
        String order = orderQueue.take();
        System.out.println(STR."Order being prepared: \{order}");
        return order;
    }
}
