package SynchronizedArray;

import UnsynchronizedArray.SimpleArray;

public class SArrayWriter implements Runnable {
    private final SSimpleArray sharedSimpleArray;
    private final int startValue;

    public SArrayWriter(int value, SSimpleArray array) {
        startValue = value;
        sharedSimpleArray = array;
    }

    @Override
    public void run() {
        for (int i = startValue; i < startValue + 3; i++) {
            sharedSimpleArray.add(i);
        }
    }
}
