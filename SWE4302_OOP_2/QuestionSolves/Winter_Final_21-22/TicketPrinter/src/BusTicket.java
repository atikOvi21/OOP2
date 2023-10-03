public class BusTicket implements ITicket {
    public BusTicket(Traveller traveller){
        System.out.println("Bus ticket generated for " + traveller.getName());
    }
}
