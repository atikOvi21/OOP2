public class CurrentAccount extends Account {
    public CurrentAccount(int accountNumber, double balance, String accountHolderName, String signature) {
        super(accountNumber, balance, accountHolderName, signature);
    }

    @Override
    public void deposit(double amount) throws UnsupportedException {
        if (amount < 500) {
            throw new UnsupportedException("Minimum deposit limit 500");
        } else {
            super.deposit(amount);
        }
    }

    @Override
    public void withdraw(double amount) throws UnsupportedException {
        if (amount > 20000) {
            throw new UnsupportedException("Maximum withdrawal limit 20000");
        } else if (getBalance() - amount < 500) {
            throw new UnsupportedException("Minimum balance 500");
        } else {
            super.withdraw(amount);
        }
    }
}
