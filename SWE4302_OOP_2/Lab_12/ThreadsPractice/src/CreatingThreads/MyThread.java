package CreatingThreads;

public class MyThread extends Thread{

    @Override
    public void run() {
        System.out.println("A thread created by extending Thread class!");
    }
}
