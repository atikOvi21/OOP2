package DeadLockk;

import java.util.concurrent.ThreadLocalRandom;

public class Philosopher implements Runnable{
    private final int id;
    private Chopstick leftChopstick;
    private Chopstick rightChopstick;

    public Philosopher(int id, Chopstick leftChopstick, Chopstick rightChopstick) {
        this.id = id;
        this.leftChopstick = leftChopstick;
        this.rightChopstick = rightChopstick;
    }

    public void performAction(String action) {
        int waitTime = ThreadLocalRandom.current().nextInt(0, 1000);
        System.out.println(STR."Philosopher \{id}: \{action} for \{waitTime} milliseconds.");
    }

    @Override
    public void run() {
        while (true) {
            performAction("Thinking");
            leftChopstick.grabChopstick();
            System.out.println(STR."Philosopher \{id}: Picked up left chopstick.");
            rightChopstick.grabChopstick();
            System.out.println(STR."Philosopher \{id}: Picked up right chopstick.");
            performAction("Eating");
            leftChopstick.dropChopstick();
            System.out.println(STR."Philosopher \{id}: Dropped left chopstick.");
            rightChopstick.dropChopstick();
            System.out.println(STR."Philosopher \{id}: Dropped right chopstick.");
            System.out.println(STR."Philosopher \{id}: Done eating.");
            System.out.println(STR."Philosopher \{id}: Thinking again.");
            System.out.println("---------------------------------------------");
        }
    }
}

