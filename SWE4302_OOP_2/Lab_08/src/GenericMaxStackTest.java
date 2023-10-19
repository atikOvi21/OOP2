import org.junit.Assert;
import org.junit.Test;

public class GenericMaxStackTest {

    GenericMaxStack<Integer> intMaxStack = new GenericMaxStack<>(5);
    GenericMaxStack<Double> doubleMaxStack = new GenericMaxStack<>(5);
    GenericMaxStack<String> stringMaxStack = new GenericMaxStack<>(5);

    @Test
    public void maxValueTest() {
        intMaxStack.push(3);
        intMaxStack.push(5);
        intMaxStack.push(2);

        int resultMax = intMaxStack.max();
        int expectedMax = 5;
        Assert.assertEquals(expectedMax, resultMax);
    }

    @Test
    public void maxValuePopTest() {
        intMaxStack.push(2);
        intMaxStack.push(1);
        intMaxStack.push(2);
        intMaxStack.push(5);
        intMaxStack.pop();

        int resultMax = intMaxStack.max();
        int expectedMax = 2;
        Assert.assertEquals(expectedMax, resultMax);

        intMaxStack.pop();

        int resultMax_2 = intMaxStack.max();
        int expectedMax_2 = 2;
        Assert.assertEquals(expectedMax_2, resultMax_2);
    }

    @Test
    public void maxFloatValueTest(){
        doubleMaxStack.push(49.75);
        doubleMaxStack.push(23.54);
        doubleMaxStack.push(100.0);

        doubleMaxStack.pop();
        double resultMax = doubleMaxStack.max();
        double expectedMax = 49.75;
        Assert.assertEquals(expectedMax, resultMax, 0.0);
    }

    @Test
    public void maxStringValueTest(){
        stringMaxStack.push("OOC is bad");
        stringMaxStack.push("Nothing to understand");
        stringMaxStack.push("Try hard");

        String resultMax = stringMaxStack.max();
        String expectedMax = "Try hard";
        Assert.assertEquals(expectedMax, resultMax);

        stringMaxStack.pop();
        String resultMax_2 = stringMaxStack.max();
        String expectedMax_2 = "OOC is bad";
        Assert.assertEquals(expectedMax_2, resultMax_2);
    }
}
