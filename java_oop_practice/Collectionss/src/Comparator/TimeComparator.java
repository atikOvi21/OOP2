package Comparator;

import java.time.LocalTime;
import java.util.Comparator;

public class TimeComparator implements Comparator<LocalTime> {

    @Override
    public int compare(LocalTime time1, LocalTime time2) {
        int hourCompare = time1.getHour() - time2.getHour();
        if (hourCompare != 0) {
            return hourCompare;
        }

        int minuteCompare = time1.getMinute() - time2.getMinute();
        if (minuteCompare != 0) {
            return minuteCompare;
        }

        return time1.getSecond() - time2.getSecond();
    }
}
