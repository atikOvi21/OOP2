public class GeneratorAndPrinter {
    private final ITicketGenerator generator;
    private final ITicketPrinter printer;

    public GeneratorAndPrinter(ITicketGenerator generator, ITicketPrinter printer) {
        this.generator = generator;
        this.printer = printer;
    }

    public void generateAndPrintTicket(Traveller traveller) {
        ITicket ticket = generator.generateTicket(traveller);
        printer.printTicket(ticket);
    }
}
