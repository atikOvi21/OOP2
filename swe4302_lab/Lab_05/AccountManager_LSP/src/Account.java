public class Account {
    private String accountNumber;
    private double balance;
    private String accountHolderName;
    private String signature;

    public Account(String accountNumber, double balance, String accountHolderName, String signature) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolderName = accountHolderName;
        this.signature = signature;
    }
}
