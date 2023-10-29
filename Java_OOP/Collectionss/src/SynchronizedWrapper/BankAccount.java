package SynchronizedWrapper;

public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public synchronized void deposit(double amount) {
        double newBalance = balance + amount;
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        balance = newBalance;
    }

    public synchronized void withdraw(double amount) {
        double newBalance = balance - amount;
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        balance = newBalance;
    }

    public synchronized double getBalance() {
        return balance;
    }

}
