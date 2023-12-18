public class BusTicket implements ITicket {
    private String destination;

    public BusTicket(String destination){
        this.destination = destination;
    }
    public BusTicket(Traveller traveller){
        System.out.println("Bus ticket generated for " + traveller.getName());
    }

    @Override
    public String getDestination() {
        return destination;
    }
}
