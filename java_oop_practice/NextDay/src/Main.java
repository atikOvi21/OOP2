import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        IDateCalculator calculator = new NextDayCalculator();

        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        System.out.print("Enter the current date (yyyy-MM-dd): ");
        String inputDateStr = scanner.nextLine();

        try {
            Date currentDate = dateFormat.parse(inputDateStr);

            Date nextDay = calculator.calculateNextDay(currentDate);

            SimpleDateFormat dayOfWeekFormat = new SimpleDateFormat("EEEE");
            String dayOfWeek = dayOfWeekFormat.format(nextDay);

            System.out.println("The next day's date is: " + dateFormat.format(nextDay) + " (" + dayOfWeek + ")");
        } catch (ParseException e) {
            System.out.println("Invalid date format. Please enter a date in yyyy-MM-dd format.");
        }
    }
}