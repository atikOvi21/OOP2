package BasicDeadLockk;

import java.util.concurrent.Semaphore;

public class Chopstick {
    public Semaphore semaphore = new Semaphore(1);
    void grabChopstick(){
        try {
            semaphore.acquire();
        } catch (InterruptedException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    void dropChopstick(){
        semaphore.release();
    }
}

