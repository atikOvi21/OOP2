package MinMaxStack;

import org.junit.Assert;
import org.junit.Test;

public class MinMaxStackTest {
    MinMaxStack<Integer> minMaxStack = new MinMaxStack<Integer>(5);

    @Test
    public void maxValueTest() {
        minMaxStack.push(3);
        minMaxStack.push(5);
        minMaxStack.push(2);

        int resultMax = minMaxStack.minMax("max");
        int expectedMax = 5;
        Assert.assertEquals(expectedMax, resultMax);

//        minMaxStack.pop();
//        minMaxStack.pop();
//        int resultMax_2 = minMaxStack.minMax("max");
//        int expectedMax_2 = 3;
//        Assert.assertEquals(expectedMax_2, resultMax_2);
    }

    @Test
    public void minValueTest() {
        minMaxStack.push(3);
        minMaxStack.push(5);
        minMaxStack.push(2);

        int resultMin = minMaxStack.minMax("min");
        int expectedMin = 2;
        Assert.assertEquals(expectedMin, resultMin);

//        minMaxStack.pop();
//        int resultMin_2 = minMaxStack.minMax("min");
//        int expectedMin_2 = 3;
//        Assert.assertEquals(expectedMin_2, resultMin_2);
    }
}
