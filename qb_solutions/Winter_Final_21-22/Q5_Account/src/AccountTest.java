import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class AccountTest {
    private Account sourceAccount;
    private Account destinationAccount;

    @Before
    public void setUp() {
        sourceAccount = new Account("Savings", "12345", 1000);
        destinationAccount = new Account("Checking", "67890", 2000);
    }

    @Test
    public void testTransferWithInsufficientBalance() {
        try {
            sourceAccount.transfer(destinationAccount, 600);

            fail("Expected InsufficientBalanceException but no exception was thrown.");
        } catch (InsufficientBalanceException e) {
            assertEquals("Minimum balance must be > 500", e.getMessage());

            assertEquals(1000, sourceAccount.getAmount());
            assertEquals(2000, destinationAccount.getAmount());
        }
    }
}
