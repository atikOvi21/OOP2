public class Account {
    private static final int MIN_BALANCE = 500;
    private String type;
    private String accountNumber;
    private int amount;

    public Account(String type, String accountNumber, int initialAmount) {
        this.type = type;
        this.accountNumber = accountNumber;
        this.amount = initialAmount;
    }

    public void debit(int debitAmount) throws InsufficientBalanceException {
        if (amount - debitAmount < MIN_BALANCE) {
            throw new InsufficientBalanceException(STR."Minimum balance must be > \{MIN_BALANCE}");
        }
        amount -= debitAmount;
        System.out.println(STR."Debited \{debitAmount}. Now the balance is \{amount}");
    }

    public void transfer(Account toAccount, int transferAmount) throws InsufficientBalanceException {
        if (amount - transferAmount < MIN_BALANCE) {
            throw new InsufficientBalanceException(STR."Minimum balance must be > \{MIN_BALANCE}");
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

// Code Smells in Account.java


// Magic Numbers: There are two instances of magic numbers in the code:
//500: This appears twice as the minimum balance threshold for both debit and transfer methods.

