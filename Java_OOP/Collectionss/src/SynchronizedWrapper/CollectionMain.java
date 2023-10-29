package SynchronizedWrapper;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionMain {
    public static void main(String[] args) {
        List<Integer> synchronizedList = Collections.synchronizedList(new ArrayList<>());

        Runnable addTask = () -> {
            for (int i = 1; i <= 10; i++) {
                synchronizedList.add(i);
            }
        };

        Thread thread1 = new Thread(addTask);
        Thread thread2 = new Thread(addTask);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        for (Integer number : synchronizedList) {
            System.out.print(number + " ");
        }
    }
}
