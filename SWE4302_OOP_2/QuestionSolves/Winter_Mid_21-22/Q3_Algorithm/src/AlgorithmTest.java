import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlgorithmTest {

    @Test
    public void testCountEvenNumbers() {
        List<Integer> intList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Algorithm<Integer> intAlgorithm = new Algorithm<>();

        int evenCount = intAlgorithm.count(intList, x -> x % 2 == 0);

        assertEquals(4, evenCount); // There are 4 even numbers in the list (2, 4, 6, 8).
    }

    @Test
    public void testCountPalindromeStrings() {
        List<String> stringList = List.of("level", "hello", "world", "deified", "algorithm");
        Algorithm<String> stringAlgorithm = new Algorithm<>();

        int palindromeCount = stringAlgorithm.count(stringList, this::isPalindrome);

        assertEquals(2, palindromeCount); // There are 2 palindrome strings in the list ("level", "deified").
    }

    private boolean isPalindrome(String str) {
        String cleanStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversedStr = new StringBuilder(cleanStr).reverse().toString();
        return cleanStr.equals(reversedStr);
    }
}
