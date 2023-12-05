import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Receptionist extends Thread {
  private final BlockingQueue<Table> availableTables;

  public Receptionist(int numberOfTables) {
    this.availableTables = new ArrayBlockingQueue<>(numberOfTables);
    for (int i = 0; i < numberOfTables; i++) {
      availableTables.add(new Table(i));
    }
  }

  public synchronized Table assignTable() throws InterruptedException {
    return availableTables.take();
  }
}
