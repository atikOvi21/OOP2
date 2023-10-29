package SynchronizedWrapper;

public class BankMain {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(100);

        Runnable depositTask = () -> {
            for(int i = 0; i < 10; i++){
                account.deposit(10);
            }
        };

        Runnable withdrawTask = () -> {
            for(int i = 0; i < 10; i++){
                account.withdraw(10);
            }
        };

        Thread depositThread = new Thread(depositTask);
        Thread withdrawThread = new Thread(withdrawTask);

        System.out.println("Initial balance: " + account.getBalance());

        depositThread.start();
        withdrawThread.start();

        try {
            depositThread.join();
            withdrawThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Final balance: " + account.getBalance());
    }
}
