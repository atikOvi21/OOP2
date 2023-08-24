import org.junit.Assert;
import org.junit.Test;

public class BottlesTest {

    private final Bottles bottles = new Bottles();

    @Test
    public void test_a_verse(){

        String expected = """
                99 bottles of beer on the wall , 99 bottles of beer .
                 Take one down and pass it around , 98 bottles of beer on the wall .
                """;

        Assert.assertEquals(expected, this.bottles.Verse(99));
    }

    @Test
    public void test_another_verse() {
        String expected = """
                89 bottles of beer on the wall , 89 bottles of beer .
                 Take one down and pass it around , 88 bottles of beer on the wall .
                """;
        Assert.assertEquals(expected, this.bottles.Verse(89));
    }

    @Test
    public void test_zero_verse () {
        String expected = """
                No more bottles of beer on the wall , no more bottles of beer .
                Go to the store and buy some more , 99 bottles of beer on the wall .
                """;
        Assert.assertEquals (expected , this.bottles.Verse (0));
    }

    @Test
    public void test_one_verse () {
        String expected = """
                1 bottle of beer on the wall , 1 bottle of beer .
                 Take it down and pass it around , no more bottles of beer on the wall .
                """;
        Assert.assertEquals (expected , this.bottles.Verse (1));
    }

    @Test
    public void test_two_verse () {
        String expected = """
                2 bottles of beer on the wall , 2 bottles of beer .
                 Take one down and pass it around , 1 bottle of beer on the wall .
                """;
        Assert.assertEquals (expected , this.bottles.Verse (2));
    }

    @Test
    public void test_a_couple_verses () {
        String expected = """
                99 bottles of beer on the wall , 99 bottles of beer .
                Take one down and pass it around , 98 bottles of beer on the wall .
                98 bottles of beer on the wall , 98 bottles of beer .
                Take one down and pass it around , 97 bottles of beer on the wall .
                """;
        Assert.assertEquals (expected , this.bottles.Verses (99 , 98));
    }

    @Test
    public void test_a_few_verses () {
        String expected = """
                2 bottles of beer on the wall , 2 bottles of beer .
                Take one down and pass it around , 1 bottle of beer on the wall .
                1 bottle of beer on the wall , 1 bottle of beer .
                Take it down and pass it around , no more bottles of beer on the wall .
                No more bottles of beer on the wall , no more bottles of beer .
                Go to the store and buy some more , 99 bottles of beer on the wall .
                """;
        Assert.assertEquals (expected , this.bottles.Verses (2 , 0));
    }

    @Test
    public void test_the_whole_song () {
        String expected = this.bottles.Verses (99 , 0);
        Assert.assertEquals (expected , this.bottles.Song ()) ;
    }
}
