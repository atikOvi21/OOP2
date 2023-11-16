package CreatingThreads;

public class ThreadUsingRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("A thread created by implementing Runnable interface!");
    }
}
