package AccountStream;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public List<Account> accountList;

    public Application(List<Account> accountList) {
        this.accountList = accountList;
    }

    public Application() {
        accountList = new ArrayList<>();

        accountList.add(new Account("Alvee", "AB", 1000));
        accountList.add(new Account("Adid", "BRAC", 4300));
        accountList.add(new Account("Nirjhar", "Islamic", 1500));
        accountList.add(new Account("Dipto", "OB", 15000));
    }
}
