import org.junit.Assert;
import org.junit.Test;

public class MinStackTest {

    MinStack minStack = new MinStack();

    @Test
    public void minTest1(){
        minStack.push(3);
        minStack.push(2);
        minStack.push(5);
        minStack.push(1);

        int resultMin = minStack.min();
        int expectedMin = 1;
        Assert.assertEquals(expectedMin, resultMin);
    }

    @Test
    public void minTest2(){
        minStack.push(3);
        minStack.push(2);
        minStack.push(5);
        minStack.push(1);

        minStack.pop();

        int resultMin = minStack.min();
        int expectedMin = 2;
        Assert.assertEquals(expectedMin, resultMin);
    }

    @Test
    public void minTest3(){
        minStack.push(12);
        minStack.push(3);
        minStack.push(4);

        int resultMin = minStack.min();
        int expectedMin = 3;
        Assert.assertEquals(expectedMin, resultMin);
    }
}
