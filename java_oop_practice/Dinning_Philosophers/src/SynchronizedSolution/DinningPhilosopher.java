package SynchronizedSolution;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DinningPhilosopher {
    public static final int numberOfPhilosophers = 5;
    public static Philosopher[] philosophers = new Philosopher[numberOfPhilosophers];
    public static Object[] forks = new Object[philosophers.length];
    public static CountDownLatch countDownLatch = new CountDownLatch(numberOfPhilosophers);

    public static void main(String[] args) {
        for (int i = 0; i < forks.length; i++) {
            forks[i] = new Object();
        }

        ExecutorService executorService = Executors.newFixedThreadPool(numberOfPhilosophers);

        for (int i = 0; i < philosophers.length; i++) {
            Object leftFork = forks[i];
            Object rightFork = forks[(i + 1) % forks.length];

            if (i == philosophers.length - 1) {

                // The last philosopher picks up the right fork first
                philosophers[i] = new Philosopher(i, rightFork, leftFork, countDownLatch);
            } else {
                philosophers[i] = new Philosopher(i, leftFork, rightFork, countDownLatch);
            }

            executorService.execute(philosophers[i]);
        }

        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            System.out.println("Error: " + e.getMessage());
        }

        for (Philosopher philosopher : philosophers) {
            System.out.println("Philosopher " + philosopher.getId() + " performed actions " + philosopher.getIterationCount() + " times.");
        }

        executorService.shutdown();
    }
}
