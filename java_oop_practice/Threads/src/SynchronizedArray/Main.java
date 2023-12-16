package SynchronizedArray;

import UnsynchronizedArray.ArrayWriter;
import UnsynchronizedArray.SimpleArray;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        SSimpleArray simpleArray = new SSimpleArray(6);

        SArrayWriter arrayWriter1 = new SArrayWriter(1, simpleArray);
        SArrayWriter arrayWriter2 = new SArrayWriter(11, simpleArray);

        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(arrayWriter1);
        executorService.execute(arrayWriter2);

        executorService.shutdown();

        try {
            boolean tasksEnded = executorService.awaitTermination(1, TimeUnit.MINUTES);

            if (tasksEnded) {
                System.out.println(simpleArray);
            } else {
                System.out.println("Timed out while waiting for tasks to finish.");
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
