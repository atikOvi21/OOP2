public class BookingManager {
    private Show show;
    private TicketPrinter ticketPrinter;

    public BookingManager(Show show, TicketPrinter ticketPrinter) {
        this.show = show;
        this.ticketPrinter = ticketPrinter;
    }

    public boolean makeBooking(int numSeats) {
        boolean booked = show.bookSeats(numSeats);
        if (booked) {
            ticketPrinter.printTicket(show.getShowName(), numSeats);
        }
        return booked;
    }
}
