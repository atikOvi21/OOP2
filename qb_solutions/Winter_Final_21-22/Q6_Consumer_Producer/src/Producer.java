import java.util.Random;
import java.util.random.RandomGenerator;

public class Producer implements Runnable {
    private final static RandomGenerator generator = new Random();
    private final Buffer sharedLocation;

    public Producer(Buffer sharedLocation) {
        this.sharedLocation = sharedLocation;
    }

    @Override
    public void run() {
        int sum = 0;

        for (int count = 1; count <= 10; count++) {
            try {
                Thread.sleep(generator.nextInt(3000));
                sharedLocation.set(count);
                sum += count;
                System.out.println(STR."Producer writes \{sum}.");
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Producer done producing.\nTerminating Producer.");

    }
}
