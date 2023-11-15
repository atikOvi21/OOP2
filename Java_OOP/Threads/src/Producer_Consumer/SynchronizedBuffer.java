package Producer_Consumer;

public class SynchronizedBuffer implements Buffer {
    private int buffer = -1;
    private boolean occupied = false;

    @Override
    public synchronized void set(int value) throws InterruptedException {
        while (occupied) {
            System.out.println(STR."Producer tries to write.");
            displayState("Buffer full. Producer waits.");
            wait();
        }

        buffer = value;
        occupied = true;
        displayState("Producer writes " + buffer);
        notifyAll();
    }

    @Override
    public int get() throws InterruptedException {
        int readValue = 0;

        while (!occupied) {
            System.out.println(STR."Consumer tries to read.");
            displayState("Buffer empty. Consumer waits.");
            wait();
        }

        occupied = false;
        readValue = buffer;
        displayState("Consumer reads " + readValue);
        notifyAll();

        return readValue;
    }

    public void displayState(String operation) {
        System.out.printf("%-40s%d\t\t%b%n%n", operation, buffer, occupied);
    }
}
