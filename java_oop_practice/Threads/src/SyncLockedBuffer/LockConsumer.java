package SyncLockedBuffer;

import java.util.Random;
import java.util.random.RandomGenerator;

public class LockConsumer implements Runnable{
    private final static RandomGenerator generator = new Random();
    private final Buffer sharedLocation;

    public LockConsumer(Buffer sharedLocation) {
        this.sharedLocation = sharedLocation;
    }

    @Override
    public void run() {
        int readValue = 0;
        int sum = 0;

        for (int count = 1; count <= 10; count++) {
            try {
                Thread.sleep(generator.nextInt(3000));
                readValue = sharedLocation.get();
                sum += readValue;
                System.out.println(STR."LockConsumer reads \{readValue}.");
                System.out.println(STR."Sum of lockconsumer reads: \{sum}.");
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println(STR."LockConsumer reads totaling \{sum}.\nTerminating LockConsumer.");
    }
}
