public class FullColorTicketPrinter implements ITicketPrinter{
    @Override
    public void printTicket(ITicket ticket) {
        System.out.println("Printing ticket in full color");
    }
}
