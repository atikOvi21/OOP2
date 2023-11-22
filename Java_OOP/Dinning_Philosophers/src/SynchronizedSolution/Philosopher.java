package SynchronizedSolution;

import java.util.concurrent.CountDownLatch;

public class Philosopher implements Runnable{
    private final int id;
    private final Object leftFork;
    private final Object rightFork;
    private final CountDownLatch countDownLatch;
    private int iterationCount;

    public Philosopher(int id, Object leftFork, Object rightFork, CountDownLatch countDownLatch) {
        this.id = id;
        this.leftFork = leftFork;
        this.rightFork = rightFork;
        this.countDownLatch = countDownLatch;
        this.iterationCount = 0;
    }

    private void doAction(String action) throws InterruptedException {
        System.out.println(STR."Philosopher \{id} : \{action}");
        Thread.sleep(((int) (Math.random() * 100)));
    }

    public int getId() {
        return id;
    }

    public int getIterationCount() {
        return iterationCount;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                // thinking
                doAction("Thinking");
                synchronized (leftFork) {
                    doAction("Picked up LEFT fork");
                    synchronized (rightFork) {
                        // eating
                        doAction("Picked up RIGHT fork - EATING");
                        doAction("Put down RIGHT fork");
                    }

                    // Back to thinking
                    doAction("Put down LEFT fork - THINKING");
                    System.out.println("--------------------------------------------");
                    iterationCount++;
                }
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return;
        } finally {
            // Signal that this philosopher has finished
            countDownLatch.countDown();
        }
    }
}
