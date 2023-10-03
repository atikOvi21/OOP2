public class AirTicketGenerator implements ITicketGenerator {
    @Override
    public ITicket generateTicket(Traveller traveller) {
        return new AirTicket(traveller);
    }
}
