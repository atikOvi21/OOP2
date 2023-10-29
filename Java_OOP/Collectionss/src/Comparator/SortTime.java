package Comparator;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class SortTime {

    public void printTimes(){
        List<LocalTime> times = new ArrayList<>(List.of(
                LocalTime.of(6, 24, 34),
                LocalTime.of(18, 14, 58),
                LocalTime.of(6, 5, 34),
                LocalTime.of(12, 14, 58),
                LocalTime.of(6, 24, 22),
                LocalTime.of(21, 30, 27)
        ));

        System.out.println("Unsorted times: " + times);

        times.sort(new TimeComparator());
        System.out.println("Sorted times: " + times);
    }
}
