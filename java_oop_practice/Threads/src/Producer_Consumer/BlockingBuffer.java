package Producer_Consumer;

import java.util.concurrent.ArrayBlockingQueue;

public class BlockingBuffer implements Buffer{
    private final ArrayBlockingQueue<Integer> buffer;

    public BlockingBuffer() {
        buffer = new ArrayBlockingQueue<>(1);
    }
    @Override
    public void set(int value) throws InterruptedException {
        buffer.put(value);
        System.out.println(STR."Producer writes \{value}.");
        System.out.println(STR."Buffer cells occupied: \{buffer.size()}");
    }

    @Override
    public int get() throws InterruptedException {
        int readValue = buffer.take();
        System.out.println(STR."Consumer reads \{readValue}.");
        return readValue;
    }
}
