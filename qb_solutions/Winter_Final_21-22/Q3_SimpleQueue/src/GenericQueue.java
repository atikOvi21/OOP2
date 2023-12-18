import java.util.LinkedList;
import java.util.Queue;

public class GenericQueue<Thingy extends Comparable<Thingy>> {
    private final Queue<Thingy> queue;

    public GenericQueue() {
        this.queue = new LinkedList<Thingy>();
    }

    public void enqueue(Thingy thingy) {
        queue.add(thingy);
    }

    public Thingy dequeue() {
        return queue.remove();
    }
}


// Classes that Implement the Comparable Interface
//Integer
//Double
//Long
//Short
//Byte
//Character
//String
//LocalDate
//LocalTime
//LocalDateTime
//ZonedDateTime
//Instant
//BigInteger
//BigDecimal
//Enum Types
//Custom Classes: Any custom class can implement the Comparable interface
// by providing its own implementation of the compareTo method.