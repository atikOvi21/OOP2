package Timezones;

public class TimezoneMain {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new TimeZonePrinter("Turkey"));
        Thread thread2 = new Thread(new TimeZonePrinter("Asia/Dhaka"));
        Thread thread3 = new Thread(new TimeZonePrinter("Asia/Singapore"));

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
