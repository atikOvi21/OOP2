public class Table {

  private final int tableNumber;
  private boolean isBooked;
  private Customer customer;

  public Table(int tableNumber) {
    this.tableNumber = tableNumber + 1;
    this.isBooked = false;
    this.customer = null;
  }

  public int getTableNumber() {
    return tableNumber;
  }

  public boolean checkBookedStatus() {
    return isBooked;
  }

  public Customer getCustomer() {
    return customer;
  }
}
