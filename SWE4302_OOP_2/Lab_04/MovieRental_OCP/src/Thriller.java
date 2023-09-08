import java.util.Calendar;
import java.util.Date;

public class Thriller extends BaseMovie implements IMovie{
    private int discount;
    public Thriller(String title, Date releaseDate, double duration) {
        super(title, releaseDate, duration);

        if(getYearsOld() > 5){
            this.discount = 25;
        } else {
            this.discount = 15;
        }
    }

    @Override
    public double getDiscount(double price) {
        return price - (price * (this.discount/100.0));
    }

    public int getYearsOld() {
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int yearsOld = year - super.releaseDate.getYear();
        return yearsOld;
    }
}
