public class ConsoleTicketPrinter implements TicketPrinter {
    @Override
    public void printTicket(String showName, int numSeats) {
        System.out.println("Ticket for " + showName + ": " + numSeats + " seats");
    }
}
