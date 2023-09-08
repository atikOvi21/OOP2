import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

public class MovieTest {
    ThrillerMovie thrillerMovie = new ThrillerMovie("The Thrill", new Date(2003, 5, 23), 146);
    RomanticMovie romanticMovie = new RomanticMovie("The Romance", new Date(2004, 6, 25), 123);
    HorrorMovie horrorMovie = new HorrorMovie("The Horror", new Date(2005, 7, 27), 112);


    @Test
    public void testThrillerMovieYear(){
        int expectedYear = 20;
        int resultYear = thrillerMovie.getYearsOld();

        Assert.assertEquals(expectedYear, resultYear);
    }


    @Test
    public void testThrillerMovie() {
        double price = 100.0;
        double expected = 75.0;
        double result = thrillerMovie.getDiscount(price);

        Assert.assertEquals(expected, result, 0.0);
    }

    @Test
    public void testRomanticMovie() {
        double price = 100.0;
        double expected = 70.0;
        double result = romanticMovie.getDiscount(price);

        Assert.assertEquals(expected, result, 0.0);
    }

    @Test
    public void testHorrorMovie() {
        double price = 100.0;
        double expected = 80.0;
        double result = horrorMovie.getDiscount(price);

        Assert.assertEquals(expected, result, 0.0);
    }

}
