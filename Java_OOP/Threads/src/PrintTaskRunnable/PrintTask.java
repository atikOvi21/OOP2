package PrintTaskRunnable;

import java.util.Random;

public class PrintTask implements Runnable{
    private final int sleepTime;
    private final String taskName;
    private final static Random generator = new Random();

    public PrintTask(String taskName) {
        this.taskName = taskName;
        sleepTime = generator.nextInt(5000);
    }

    @Override
    public void run() {
        try {
            System.out.println(STR."\{taskName} going to sleep for \{sleepTime} milliseconds.");
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            System.out.println(STR."\{taskName} terminated prematurely due to interruption.");
        }

        System.out.println(STR."\{taskName} done sleeping.");
    }
}
