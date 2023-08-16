public class Main {
    public static void main(String[] args) {
        Show theaterShow = new TheaterShow("The Phantom of the Opera", 100);
        TicketPrinter consoleTicketPrinter = new ConsoleTicketPrinter();
        BookingManager bookingManager = new BookingManager(theaterShow, consoleTicketPrinter);

        int numSeatsToBook = 5;
        if (bookingManager.makeBooking(numSeatsToBook)) {
            System.out.println("Booking successful!");
        } else {
            System.out.println("Booking failed. Not enough seats available.");
        }
    }
}
