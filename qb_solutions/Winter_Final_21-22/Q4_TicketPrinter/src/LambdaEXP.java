import java.util.Arrays;

public class LambdaEXP {
    // Lambda expression to print all the tickets with the same destination address
    public static void printTickets(ITicket[] tickets, String destination) {
        Arrays.stream(tickets)
                .filter(ticket -> ticket.getDestination().equals(destination))
                .forEach(ticket -> System.out.println(ticket));
    }
}
