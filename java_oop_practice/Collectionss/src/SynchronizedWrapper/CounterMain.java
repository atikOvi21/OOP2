package SynchronizedWrapper;

public class CounterMain {
    public static void main(String[] args) {
        SharedCounter sharedCounter = new SharedCounter();

        Runnable incrementTask = () -> {
            for(int i = 0; i < 10; i++){
                sharedCounter.increment();
            }
        };

        Thread thread1 = new Thread(incrementTask);
        Thread thread2 = new Thread(incrementTask);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e){
            throw new RuntimeException(e);
        }

        System.out.println("Count: " + sharedCounter.getCount());
    }
}
