public class Main {
    public static void main(String[] args) {
        for(int i = 0; i < 2; i ++) {
            BasicThread thread1 = new BasicThread(1);
            thread1.start();
        }

        for(int i = 0; i < 2; i ++) {
            BasicThread thread2 = new BasicThread(2);
            thread2.start();
        }

        BasicRunnable runnable1 = new BasicRunnable(55);
        Thread thread3 = new Thread(runnable1);
        thread3.start();
    }
}