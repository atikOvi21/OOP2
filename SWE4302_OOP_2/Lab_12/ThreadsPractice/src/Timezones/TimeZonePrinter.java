package Timezones;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class TimeZonePrinter implements Runnable{
    private final String timeZone;
    private final long startTime;

    public TimeZonePrinter(String timeZone) {
        this.timeZone = timeZone;
        this.startTime = System.currentTimeMillis();
    }

    @Override
    public void run() {
        while ((System.currentTimeMillis() - startTime) <= 60000) { // Run for 60 seconds
            Date date = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            sdf.setTimeZone(TimeZone.getTimeZone(timeZone));
            String formattedDate = sdf.format(date);
            System.out.println(STR."Time in \{timeZone} : \{formattedDate}");

            try {
                Thread.sleep(2000); // Print time every 2 seconds
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }

    }
}
