package CreatingThreads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServeThread {
    public static void main(String[] args) {
        int numberOfTasks = 5;
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for (int i = 0; i < numberOfTasks; i++) {
            Task task = new Task(i);
            executorService.execute(task);
        }

        executorService.shutdown();
    }
}
