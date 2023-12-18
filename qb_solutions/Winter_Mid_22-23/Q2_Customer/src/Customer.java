public class Customer {
    public PaymentProcessor paymentProcessor;

    public Customer(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    public void pay() {
        paymentProcessor.processPayment();
    }
}
