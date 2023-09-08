import java.util.Date;

public class HorrorMovie extends BaseMovie{
    private int discount;
    private MovieType movieType;


    public HorrorMovie(String title, Date releaseDate, double duration) {
        super(title, releaseDate, duration);
        this.movieType = MovieType.HORROR;
        this.discount = 20;
    }

    public double getDiscount(double price){
        return price - (price * (this.discount/100.0));
    }

}
