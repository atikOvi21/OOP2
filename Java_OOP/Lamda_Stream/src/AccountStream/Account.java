package AccountStream;

public class Account {
    public String name;
    public String bank;
    public double balance;

    public Account(String name, String bank, double balance) {
        this.name = name;
        this.bank = bank;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", bank='" + bank + '\'' +
                ", balance=" + balance +
                '}';
    }
}
