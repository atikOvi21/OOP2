public class Account {
    private String type;
    private String accountNumber;
    private int amount;

    public Account(String type, String accountNumber, int initialAmount) {
        this.type = type;
        this.accountNumber = accountNumber;
        this.amount = initialAmount;
    }

    public void debit(int debitAmount) throws InsufficientBalanceException {
        if (amount - debitAmount < 500) {
            throw new InsufficientBalanceException("Minimum balance must be > 500");
        }
        amount -= debitAmount;
        System.out.println("Debited " + debitAmount + ". Now the balance is " + amount);
    }

    public void transfer(Account toAccount, int transferAmount) throws InsufficientBalanceException {
        if (amount - transferAmount < 500) {
            throw new InsufficientBalanceException("Minimum balance must be > 500");
        }
        toAccount.credit(transferAmount);
        amount -= transferAmount;
    }

    public void credit(int creditAmount) {
        amount += creditAmount;
    }

    public int getAmount() {
        return amount;
    }
}
