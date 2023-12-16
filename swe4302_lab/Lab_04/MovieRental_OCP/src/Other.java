import java.util.Date;

public class Other extends BaseMovie implements IMovie{
    public Other(String title, Date releaseDate, double duration) {
        super(title, releaseDate, duration);
    }

    @Override
    public double getDiscount(double price) {
        return 0;
    }
}
