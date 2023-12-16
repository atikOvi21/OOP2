public class Order {
    public String meal;
    public Customer customer;
    public boolean isPrepared;

    public Order(String meal, Customer customer) {
        this.meal = meal;
        this.customer = customer;
        this.isPrepared = false;
    }

    public synchronized void getFood() throws InterruptedException {
        while (!isPrepared) {
            System.out.println("Customer " + customer.customerId + " is waiting for food");
            wait();
        }
        System.out.println("Customer " + customer.customerId + " has got food");
    }

    public synchronized void serveFood() throws InterruptedException {
        System.out.println("Food is served to Customer " + customer.customerId);
        this.isPrepared = true;
        notify();
    }
}
