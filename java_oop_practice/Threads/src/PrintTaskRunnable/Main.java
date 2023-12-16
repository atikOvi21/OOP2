package PrintTaskRunnable;

public class Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new PrintTask("Task1"));
        Thread thread2 = new Thread(new PrintTask("Task2"));
        Thread thread3 = new Thread(new PrintTask("Task3"));

        System.out.println("Starting threads");
        thread1.start();
        thread2.start();
        thread3.start();

        System.out.println("Threads started, main ends\n");
    }
}
