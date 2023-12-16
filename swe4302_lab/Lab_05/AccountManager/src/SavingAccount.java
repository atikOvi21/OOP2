public class SavingAccount extends Account implements IAccount{
    public SavingAccount(int accountNumber, double balance, String accountHolderName, String signature) {
        super(accountNumber, balance, accountHolderName, signature);
    }

    @Override
    public void deposit(double amount) throws UnsupportedException {
        if (amount < 1000) {
            throw new UnsupportedException("Minimum deposit limit 1000");
        } else {
            super.deposit(amount);
        }
    }

    @Override
    public void withdraw(double amount) throws UnsupportedException {
        if (amount > 15000) {
            throw new UnsupportedException("Maximum withdrawal limit 15000");
        } else if (getBalance() - amount < 1000) {
            throw new UnsupportedException("Minimum balance 1000");
        } else {
            super.withdraw(amount);
        }
    }

    @Override
    public double getInterest() {
        double interest = super.balance * 0.10;
        super.balance += interest;
        return interest;
    }
}
