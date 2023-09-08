import java.util.Date;

public class Romantic extends BaseMovie implements IMovie{
    private int discount;
    public Romantic(String title, Date releaseDate, double duration) {
        super(title, releaseDate, duration);
        this.discount = 30;
    }

    @Override
    public double getDiscount(double price) {
        return price - (price * (this.discount/100.0));
    }
}
