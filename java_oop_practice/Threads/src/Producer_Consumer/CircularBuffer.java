package Producer_Consumer;

public class CircularBuffer implements Buffer{
    private final int[] buffer = {-1, -1, -1};

    private int occupiedCells = 0;
    private int writeIndex = 0;
    private int readIndex = 0;

    @Override
    public synchronized void set(int value) throws InterruptedException {
        while(occupiedCells == buffer.length) {
            System.out.println("All cells full. LockProducer waits.");
            wait();
        }

        buffer[writeIndex] = value;
        writeIndex = (writeIndex + 1) % buffer.length;
        ++occupiedCells;
        displayState("LockProducer writes " + value);
        notifyAll();
    }

    @Override
    public synchronized int get() throws InterruptedException {
        while(occupiedCells == 0) {
            System.out.println("All cells empty. LockConsumer waits.");
            wait();
        }

        int readValue = buffer[readIndex];
        readIndex = (readIndex + 1) % buffer.length;
        --occupiedCells;
        displayState("LockConsumer reads " + readValue);
        notifyAll();

        return readValue;
    }

    public void displayState(String operation) {
        System.out.printf("%s%s%d)%n%s", operation, " (buffer cells occupied: ", occupiedCells, "buffer cells: ");

        for(int value : buffer) {
            System.out.printf(" %2d  ", value);
        }

        System.out.println();

        for(int i = 0; i < buffer.length; i++) {
            System.out.print("---- ");
        }

        System.out.println();

        for(int i = 0; i < buffer.length; i++) {
            if(i == writeIndex && i == readIndex) {
                System.out.print(" WR  ");
            } else if(i == writeIndex) {
                System.out.print(" W   ");
            } else if(i == readIndex) {
                System.out.print("  R  ");
            } else {
                System.out.print("     ");
            }
        }

        System.out.println();
    }
}
