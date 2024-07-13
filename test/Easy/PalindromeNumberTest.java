package Easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeNumberTest {
    private static final Logger LOGGER = Logger.getLogger(PalindromeNumberTest.class.getName());
    private PalindromeNumber checker;

    static {
        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setFormatter(new HashMapVisualization.CustomFormatter());
        consoleHandler.setLevel(Level.ALL);
        LOGGER.addHandler(consoleHandler);
        LOGGER.setLevel(Level.ALL);
        LOGGER.setUseParentHandlers(false);
    }

    @BeforeEach
    void setUp() {
        checker = new PalindromeNumber();
    }


    @Test
    public void testPositivePalindrome() {
        LOGGER.info("Testing positive palindrome case: 121");
        assertTrue(checker.isPalindrome(121), "121 should be a palindrome");
    }

    @Test
    public void testNegativeNumber() {
        LOGGER.info("Testing negative number case: -121");
        assertFalse(checker.isPalindrome(-121), "-121 should not be a palindrome");
    }

    @Test
    public void testNonPalindrome() {
        assertFalse(checker.isPalindrome(10), "10 should not be a palindrome");
    }

    @Test
    public void testSingleDigit() {
        assertTrue(checker.isPalindrome(7), "Single digit 7 should be a palindrome");
    }

    @Test
    public void testZero() {
        assertTrue(checker.isPalindrome(0), "0 should be a palindrome");
    }

    @Test
    public void testLargePalindrome() {
        assertTrue(checker.isPalindrome(1234321), "1234321 should be a palindrome");
    }

    @Test
    public void testLargeNonPalindrome() {
        assertFalse(checker.isPalindrome(1234567), "1234567 should not be a palindrome");
    }

    @Test
    public void testEdgeCaseNonPalindrome() {
        assertFalse(checker.isPalindrome(2147483647), "2147483647 should not be a palindrome");
    }
}