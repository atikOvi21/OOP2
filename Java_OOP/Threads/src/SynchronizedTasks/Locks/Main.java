package SynchronizedTasks.Locks;

public class Main {
    public static void main(String[] args) {
        SharedResourceLock sharedResource = new SharedResourceLock();

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
