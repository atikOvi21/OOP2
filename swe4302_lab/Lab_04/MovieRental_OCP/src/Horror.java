import java.util.Date;

public class Horror extends BaseMovie implements IMovie{
    private int discount;
    public Horror(String title, Date releaseDate, double duration) {
        super(title, releaseDate, duration);
        this.discount = 20;
    }

    @Override
    public double getDiscount(double price) {
        return price - (price * (this.discount/100.0));
    }
}
