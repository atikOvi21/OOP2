package Producer_Consumer;

import java.util.Random;
import java.util.random.RandomGenerator;

public class Consumer implements Runnable{
    private final static RandomGenerator generator = new Random();
    private final Buffer sharedLocation;

    public Consumer(Buffer sharedLocation) {
        this.sharedLocation = sharedLocation;
    }

    @Override
    public void run() {
        int sum = 0;

        for (int count = 1; count <= 10; count++) {
            try {
                Thread.sleep(generator.nextInt(3000));
                sum += sharedLocation.get();
                System.out.println(STR."Consumer reads \{sum}.");
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println(STR."Consumer reads totaling \{sum}.\nTerminating Consumer.");
    }
}
