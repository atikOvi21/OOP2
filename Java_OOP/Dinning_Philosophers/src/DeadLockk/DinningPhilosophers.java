package DeadLockk;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DinningPhilosophers {
    public static int numberOfPhilosophers = 5;
    public static Philosopher[] philosophers = new Philosopher[numberOfPhilosophers];
    public static Chopstick[] chopsticks = new Chopstick[numberOfPhilosophers];

    public static void main(String[] args) {

        for (int i = 0; i < numberOfPhilosophers; i++) {
            chopsticks[i] = new Chopstick();
        }

        ExecutorService executor = Executors.newFixedThreadPool(numberOfPhilosophers);

        for (int i = 0; i < numberOfPhilosophers; i++) {
            philosophers[i] = new Philosopher(i, chopsticks[i], chopsticks[(i + 1) % numberOfPhilosophers]);

            executor.execute(philosophers[i]);
        }

        executor.shutdown();
    }
}
