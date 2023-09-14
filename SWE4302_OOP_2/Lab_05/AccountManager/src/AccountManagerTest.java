import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class AccountManagerTest {
    SavingAccount savingAccount = new SavingAccount(210032, 25000.0, "Hasin", "Hasin");
    CurrentAccount currentAccount = new CurrentAccount(329943, 30000.0, "Mahtab", "Mahtab");
    IslamicAccount islamicAccount = new IslamicAccount(774322, 20000.0, "Alvee", "Alvee");

    @Test
    public void testSavingValidWithdraw() {
        try {
            savingAccount.withdraw(1000);
            double expected = 24000.0;
            double result = savingAccount.getBalance();
            assertEquals(expected, result, 0.0);
        } catch (UnsupportedException e) {
            fail("Unexpected UnsupportedException");
        }
    }

    @Test
    public void testSavingInvalidWithdraw() {
        try {
            savingAccount.withdraw(16000);
            fail("Expected UnsupportedException");
        } catch (UnsupportedException e) {
            assertEquals("Maximum withdrawal limit 15000", e.getMessage());
        }
    }

    @Test
    public void testSavingValidDeposit() {
        try {
            savingAccount.deposit(1800);
            double expected = 26800.0;
            double result = savingAccount.getBalance();
            assertEquals(expected, result, 0.0);
        } catch (UnsupportedException e) {
            fail("Unexpected UnsupportedException");
        }
    }

    @Test
    public void testSavingInvalidDeposit() {
        try {
            savingAccount.deposit(800);
            fail("Expected UnsupportedException");
        } catch (UnsupportedException e) {
            assertEquals("Minimum deposit limit 1000", e.getMessage());
        }
    }

    @Test
    public void testCurrentValidWithdraw() {
        try {
            currentAccount.withdraw(1000);
            double expected = 29000.0;
            double result = currentAccount.getBalance();
            assertEquals(expected, result, 0.0);
        } catch (UnsupportedException e) {
            fail("Unexpected UnsupportedException");
        }
    }

    @Test
    public void testCurrentInvalidWithdraw() {
        try {
            currentAccount.withdraw(22000);
            fail("Expected UnsupportedException");
        } catch (UnsupportedException e) {
            assertEquals("Maximum withdrawal limit 20000", e.getMessage());
        }
    }

    @Test
    public void testCurrentValidDeposit() {
        try {
            currentAccount.deposit(700);
            double expected = 30700.0;
            double result = currentAccount.getBalance();
            assertEquals(expected, result, 0.0);
        } catch (UnsupportedException e) {
            fail("Unexpected UnsupportedException");
        }
    }

    @Test
    public void testCurrentInvalidDeposit() {
        try {
            currentAccount.deposit(200);
            fail("Expected UnsupportedException");
        } catch (UnsupportedException e) {
            assertEquals("Minimum deposit limit 500", e.getMessage());
        }
    }

    @Test
    public void testIslamicValidWithdraw() {
        try {
            islamicAccount.withdraw(9000);
            double expected = 11000.0;
            double result = islamicAccount.getBalance();
            assertEquals(expected, result, 0.0);
        } catch (UnsupportedException e) {
            fail("Unexpected UnsupportedException");
        }
    }

    @Test
    public void testIslamicInvalidWithdraw() {
        try {
            islamicAccount.withdraw(12000);
            fail("Expected UnsupportedException");
        } catch (UnsupportedException e) {
            assertEquals("Maximum withdrawal limit 10000", e.getMessage());
        }
    }

    @Test
    public void testIslamicValidDeposit() {
        try {
            islamicAccount.deposit(600);
            double expected = 20600.0;
            double result = islamicAccount.getBalance();
            assertEquals(expected, result, 0.0);
        } catch (UnsupportedException e) {
            fail("Unexpected UnsupportedException");
        }
    }

    @Test
    public void testIslamicInvalidDeposit() {
        try {
            islamicAccount.deposit(100);
            fail("Expected UnsupportedException");
        } catch (UnsupportedException e) {
            assertEquals("Minimum deposit limit 200", e.getMessage());
        }
    }

    @Test
    public void testSavingValidInterest() {
        double expected = 2500.0;
        double result = savingAccount.getInterest();
        assertEquals(expected, result, 0.0);
    }

    @Test
    public void testCurrentValidInterest() {
        double expected = 2400.0;
        double result = currentAccount.getInterest();
        assertEquals(expected, result, 0.0);
    }

}
