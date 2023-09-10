public class Account {
    private int accountNumber;
    private double balance;
    private String accountHolderName;
    private String signature;

    public Account(int accountNumber, double balance, String accountHolderName, String signature) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolderName = accountHolderName;
        this.signature = signature;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) throws UnsupportedException {
        balance += amount;
    }

    public void withdraw(double amount) throws UnsupportedException {
        if (amount > balance) {
            throw new UnsupportedException("Insufficient balance");
        } else {
            balance -= amount;
        }
    }
}
