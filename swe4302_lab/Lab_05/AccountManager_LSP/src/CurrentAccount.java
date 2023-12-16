public class CurrentAccount extends Account implements IAccount{
    public CurrentAccount(String accountNumber, double balance, String accountHolderName, String signature) {
        super(accountNumber, balance, accountHolderName, signature);
    }

    @Override
    public double checkBalance() {
        return 0;
    }

    @Override
    public void deposit(double amount) {

    }

    @Override
    public void withdraw(double amount) {

    }
}
