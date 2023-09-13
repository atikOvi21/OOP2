public class IslamicAccount extends Account{
    public IslamicAccount(int accountNumber, double balance, String accountHolderName, String signature) {
        super(accountNumber, balance, accountHolderName, signature);
    }

    @Override
    public void deposit(double amount) throws UnsupportedException {
        if (amount < 200) {
            throw new UnsupportedException("Minimum deposit limit 200");
        } else {
            super.deposit(amount);
        }
    }

    @Override
    public void withdraw(double amount) throws UnsupportedException {
        if (amount > 10000) {
            throw new UnsupportedException("Maximum withdrawal limit 10000");
        } else if (getBalance() - amount < 200) {
            throw new UnsupportedException("Minimum balance 200");
        } else {
            super.withdraw(amount);
        }
    }
}
