import java.util.Calendar;
import java.util.Date;

public class NextDayCalculator implements IDateCalculator{
    @Override
    public Date calculateNextDay(Date currentDate) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(currentDate);
        calendar.add(Calendar.DAY_OF_MONTH, 1);
        return calendar.getTime();
    }
}
