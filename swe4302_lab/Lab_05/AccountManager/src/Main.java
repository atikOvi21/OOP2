public class Main {
    public static void main(String[] args) {
        SavingAccount savingAccount = new SavingAccount(210032, 25000, "Hasin", "Hasin");
        CurrentAccount currentAccount = new CurrentAccount(329943, 30000, "Mahtab", "Mahtab");
        IslamicAccount islamicAccount = new IslamicAccount(774322, 20000, "Alvee", "Alvee");

        try {
            savingAccount.withdraw(16000);
        } catch (UnsupportedException ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        try {
            savingAccount.withdraw(1000);
        } catch (UnsupportedException ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        try {
            currentAccount.withdraw(22000);
        } catch (UnsupportedException ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        try {
            currentAccount.withdraw(1000);
        } catch (UnsupportedException ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        try{
            savingAccount.deposit(800);
        } catch(UnsupportedException ex){
            System.out.println("Error: " + ex.getMessage());
        }

        try{
            currentAccount.deposit(200);
        } catch(UnsupportedException ex){
            System.out.println("Error: " + ex.getMessage());
        }

        try{
            savingAccount.deposit(1800);
        } catch(UnsupportedException ex){
            System.out.println("Error: " + ex.getMessage());
        }

        try{
            currentAccount.deposit(700);
        } catch(UnsupportedException ex){
            System.out.println("Error: " + ex.getMessage());
        }

        try{
            islamicAccount.withdraw(12000);
        } catch(UnsupportedException ex){
            System.out.println("Error: " + ex.getMessage());
        }

        try{
            islamicAccount.deposit(100);
        } catch(UnsupportedException ex){
            System.out.println("Error: " + ex.getMessage());
        }

        try{
            islamicAccount.withdraw(9000);
        } catch(UnsupportedException ex){
            System.out.println("Error: " + ex.getMessage());
        }

        try{
            islamicAccount.deposit(600);
        } catch(UnsupportedException ex){
            System.out.println("Error: " + ex.getMessage());
        }

        System.out.println("Saving Account Balance: " + savingAccount.getBalance());
        System.out.println("Current Account Balance: " + currentAccount.getBalance());
        System.out.println("Islamic Account Balance: " + islamicAccount.getBalance());

        System.out.println("Saving Account Interest: " + savingAccount.getInterest());
        System.out.println("Current Account Interest: " + currentAccount.getInterest());

    }
}