package SynchronizedTasks.SynchronizedBlocks;

public class Main {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        Thread thread1 = new Thread(sharedResource);
        Thread thread2 = new Thread(sharedResource);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Threads interrupted");
        }
    }
}
