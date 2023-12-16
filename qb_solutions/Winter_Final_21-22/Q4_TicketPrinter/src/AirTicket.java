public class AirTicket implements ITicket {
    public AirTicket(Traveller traveller) {
        System.out.println("AirTicket created for " + traveller.getName());
    }
}
