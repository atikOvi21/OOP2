import java.util.Date;

public class RomanticMovie extends BaseMovie{
    private final int discount;
    private MovieType movieType;


    public RomanticMovie(String title, Date releaseDate, double duration) {
        super(title, releaseDate, duration);
        this.movieType = MovieType.ROMANTIC;
        this.discount = 30;
    }

    public double getDiscount(double price){
        return price - (price * (this.discount/100.0));
    }
}
