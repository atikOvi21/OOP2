package SynchronizedDeadLock;

public class Philosopher implements Runnable{
    private final int id;
    private final Object leftFork;
    private final Object rightFork;

    public Philosopher(int id, Object leftFork, Object rightFork) {
        this.id = id;
        this.leftFork = leftFork;
        this.rightFork = rightFork;
    }

    private void doAction(String action) throws InterruptedException {
        System.out.println(STR."Philosopher \{id} : \{action}");
        Thread.sleep(((int) (Math.random() * 100)));
    }

    @Override
    public void run() {
        try {
            while (true) {
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
                }
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return;
        }
    }
}
