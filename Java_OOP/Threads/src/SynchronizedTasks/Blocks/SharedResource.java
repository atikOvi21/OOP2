package SynchronizedTasks.Blocks;

public class SharedResource implements Runnable{
    private int counter = 0;

    private synchronized void increment() {
        counter++;
        System.out.println("Incremented counter to: " + counter);
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            increment();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
