import java.util.Date;

public class Main {
    public static void main(String[] args) {

        ThrillerMovie thrillerMovie = new ThrillerMovie("The Thrill", new Date(2003, 5, 23), 146);
        RomanticMovie romanticMovie = new RomanticMovie("The Romance", new Date(2004, 6, 25), 123);
        HorrorMovie horrorMovie = new HorrorMovie("The Horror", new Date(2005, 7, 27), 112);

        System.out.println("Thriller Movie");
        System.out.println("Price: " + thrillerMovie.getDiscount(100));
        System.out.println("Years Old: " + thrillerMovie.getYearsOld());

        System.out.println("Romantic Movie");
        System.out.println("Price: " + romanticMovie.getDiscount(100));

        System.out.println("Horror Movie");
        System.out.println("Price: " + horrorMovie.getDiscount(100));


    }
}