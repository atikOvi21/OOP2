package SynchronizedDeadLock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DinningPhilosopher {
    public static final int numberOfPhilosophers = 5;
    public static Philosopher[] philosophers = new Philosopher[numberOfPhilosophers];
    public static Object[] forks = new Object[philosophers.length];

    public static void main(String[] args) {
        for (int i = 0; i < forks.length; i++) {
            forks[i] = new Object();
        }

        ExecutorService executorService = Executors.newFixedThreadPool(numberOfPhilosophers);

        for (int i = 0; i < philosophers.length; i++) {
            Object leftFork = forks[i];
            Object rightFork = forks[(i + 1) % forks.length];

            philosophers[i] = new Philosopher(i, leftFork, rightFork);

            executorService.execute(philosophers[i]);
            //executorService.submit(philosophers[i]);
        }

        executorService.shutdown();
    }
}
