package CreatingThreads;

public class PriorityTask implements Runnable{
    private String name;

    public PriorityTask(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i=1; i<=4; i++) {
            System.out.println(STR."Executing task: \{name}, iteration: \{i}");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
