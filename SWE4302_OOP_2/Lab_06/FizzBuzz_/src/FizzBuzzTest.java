import org.junit.Test;

public class FizzBuzzTest {
    FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void findFizzTest(){
        String expected = "Fizz";
        String result = fizzBuzz.getFizzyBuzz(3);
    }

    @Test
    public void findBuzzTest(){
        String expected = "Buzz";
        String result = fizzBuzz.getFizzyBuzz(7);
    }

    @Test
    public void findFizzBuzzTest(){
        String expected = "Fizzbuzz";
        String result = fizzBuzz.getFizzyBuzz(21);
    }

    @Test
    public void findGotchaTest(){
        String expected = "Gotcha";
        String result = fizzBuzz.getFizzyBuzz(32);
    }

}
