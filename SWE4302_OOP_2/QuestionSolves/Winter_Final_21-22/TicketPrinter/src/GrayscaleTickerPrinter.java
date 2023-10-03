public class GrayscaleTickerPrinter implements ITicketPrinter{
    @Override
    public void printTicket(ITicket ticket) {
        System.out.println("Printing grayscale ticket");
    }
}
