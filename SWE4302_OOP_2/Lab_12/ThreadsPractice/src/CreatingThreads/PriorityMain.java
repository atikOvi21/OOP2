package CreatingThreads;

public class PriorityMain {
    public static void main(String[] args) {
        Thread t1 = new Thread(new PriorityTask("Min"));
        Thread t2 = new Thread(new PriorityTask("Max"));
        Thread t3 = new Thread(new PriorityTask("Norm"));

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t3.setPriority(Thread.NORM_PRIORITY);

//        t1.start();
//        t2.start();
//        t3.start();

        Thread thread11 = new Thread( () -> {
         String threadName = Thread.currentThread().getName();
            System.out.println(STR."This is \{threadName}");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread thread12 = new Thread( () -> {
            try {
                thread11.join();
                String threadName = Thread.currentThread().getName();
                System.out.println(STR."This is \{threadName}");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        thread11.start();
        thread12.start();
    }
}
