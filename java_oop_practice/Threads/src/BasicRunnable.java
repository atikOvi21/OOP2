public class BasicRunnable implements Runnable{
    private final int threadNumber;

    public BasicRunnable(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(STR."Counting \{i}...");
            System.out.println(STR."Thread number: \{threadNumber}");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted!");
            }
        }
    }
}
