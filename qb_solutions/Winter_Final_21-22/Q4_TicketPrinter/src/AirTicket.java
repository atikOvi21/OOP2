public class AirTicket implements ITicket {
    private String destination;

    public AirTicket(String destination) {
        this.destination = destination;
    }
    public AirTicket(Traveller traveller) {
        System.out.println("AirTicket created for " + traveller.getName());
    }

    @Override
    public String getDestination() {
        return destination;
    }
}
