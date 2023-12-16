package AccountStream;

import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Application application = new Application();
        List<Account> highBalancedAccounts = application.accountList.stream().filter(a -> a.balance > 1000).toList();
        System.out.println(highBalancedAccounts.size());
        System.out.println(highBalancedAccounts.stream().min(Comparator.comparing(Account::getBalance)));

        highBalancedAccounts.forEach(a -> System.out.println(a.toString()));

        List<String> mappedAccountNames = application.accountList.stream().map(a -> a.name).toList();
        mappedAccountNames.forEach(s -> System.out.println(s));

        List<Account> mappedAccounts = application.accountList.stream().map(a -> new Account(a.name, a.bank, a.balance*2)).toList();
        mappedAccounts.forEach(a -> System.out.println(a.toString()));

    }
}
