public class Main {
    public static void main(String[] args) {
        // The problem with the old code is that is tightly coupled. We can fix that by using dependency injection.
        // Dependency injection is a technique whereby one object supplies the dependencies of another object.
        // A dependency is an object that can be used (a service). An injection is the passing of
        // a dependency to a dependent object (a client) that would use it.

        // We can use dependency injection to decouple the Customer class from the PaymentProcessor class.
        // We can do this by passing the PaymentProcessor object to the Customer constructor.
        // This is called constructor injection.
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        Customer customer = new Customer(paymentProcessor);
        customer.pay();
    }
}