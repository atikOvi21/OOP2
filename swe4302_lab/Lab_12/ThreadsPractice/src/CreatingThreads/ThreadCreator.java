package CreatingThreads;

public class ThreadCreator {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();

        ThreadUsingRunnable threadUsingRunnable = new ThreadUsingRunnable();
        Thread runnableThread = new Thread(threadUsingRunnable);
        runnableThread.start();

        Runnable runnable = () -> System.out.println("Thread from lambda runnable");
        Thread lambdaThread = new Thread(runnable);
        lambdaThread.start();

        ThreadExample threadExample = new ThreadExample(3);
        threadExample.start();

        int count = 3;
        Runnable task = () -> {
            for (int i =0; i <= count; i++) {
                System.out.println(STR."Thread: \{Thread.currentThread().getName()}, Count: \{i}");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());;
                }
            }
        };

        lambdaThread = new Thread(task);
        lambdaThread.start();
    }
}
