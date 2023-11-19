package Locksss;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SyncLMain {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();

        Buffer sharedLocation = new SynchronizedBuffer();

        System.out.printf("%-40s%s\t\t%s%n%-40s%s%n%n", "Operation", "Buffer", "Occupied", "---------", "------\t\t--------");

        executorService.execute(new LockProducer(sharedLocation));
        executorService.execute(new LockConsumer(sharedLocation));

        executorService.shutdown();
    }
}
