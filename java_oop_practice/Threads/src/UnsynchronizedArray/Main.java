package UnsynchronizedArray;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        SimpleArray simpleArray = new SimpleArray(6);

        ArrayWriter arrayWriter1 = new ArrayWriter(1, simpleArray);
        ArrayWriter arrayWriter2 = new ArrayWriter(11, simpleArray);

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
