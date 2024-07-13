package Easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {
    private static final Logger LOGGER = Logger.getLogger(TwoSumTest.class.getName());
    private static final String HYPHENS = "-".repeat(100);

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
    }

    @Test
    void twoSumJavaStream() {
        LOGGER.info("Testing TwoSum Java Stream ");
        TwoSum ts = new TwoSum();

        // Test case 1
        int[] result1 = ts.twoSumUsingJavaStream(new int[]{2, 7, 11, 15}, 9);
        LOGGER.info("Test case 1 - Input: [2, 7, 11, 15], Target: 9, Result: " + Arrays.toString(result1));
        assertArrayEquals(new int[]{0, 1}, result1);

        // Test case 2
        int[] result2 = ts.twoSumUsingJavaStream(new int[]{1, 2, 3}, 5);
        LOGGER.info("Test case 2 - Input: [1, 2, 3], Target: 5, Result: " + Arrays.toString(result2));
        assertArrayEquals(new int[]{1, 2}, result2);

        // Test case 3: No solution case
        int[] result3 = ts.twoSumUsingJavaStream(new int[]{1, 2, 3}, 7);
        LOGGER.info("Test case 3 - Input: [1, 2, 3], Target: 7, Result: " + Arrays.toString(result3));
        assertArrayEquals(new int[]{}, result3);

        // Test case 4: Negative numbers
        int[] result4 = ts.twoSumUsingJavaStream(new int[]{-1, -2, -3, -4, -5}, -8);
        LOGGER.info("Test case 4 - Input: [-1, -2, -3, -4, -5], Target: -8, Result: " + Arrays.toString(result4));
        assertArrayEquals(new int[]{2, 4}, result4);

        // Test case 5: Multiple solutions, should return the first correct one
        int[] result5 = ts.twoSumUsingJavaStream(new int[]{3, 3, 4, 4}, 6);
        LOGGER.info("Test case 5 - Input: [3, 3, 4, 4], Target: 6, Result: " + Arrays.toString(result5));
        assertArrayEquals(new int[]{0, 1}, result5);
        LOGGER.info(HYPHENS);
    }

    @Test
    void twoSumHashTable() {
        LOGGER.info("Testing TwoSum Hash Table ");
        TwoSum ts = new TwoSum();
        int[] result1 = ts.twoSumHashTable(new int[]{2, 7, 11, 15}, 9);
        int[] result2 = ts.twoSumHashTable(new int[]{1, 2, 3}, 5);
        int[] result3 = ts.twoSumHashTable(new int[]{1, 2, 3}, 7);
        int[] result4 = ts.twoSumHashTable(new int[]{-1, -2, -3, -4, -5}, -8);
        int[] result5 = ts.twoSumHashTable(new int[]{3, 3, 4, 4}, 6);

        LOGGER.info("Test case 1 - Input: [2, 7, 11, 15], Target: 9, Result: " + Arrays.toString(result1));
        LOGGER.info("Test case 2 - Input: [1, 2, 3], Target: 5, Result: " + Arrays.toString(result2));
        LOGGER.info("Test case 3 - Input: [1, 2, 3], Target: 7, Result: " + Arrays.toString(result3));
        LOGGER.info("Test case 4 - Input: [-1, -2, -3, -4, -5], Target: -8, Result: " + Arrays.toString(result4));
        LOGGER.info("Test case 5 - Input: [3, 3, 4, 4], Target: 6, Result: " + Arrays.toString(result5));

        assertArrayEquals(new int[]{0, 1}, result1);
        assertArrayEquals(new int[]{1, 2}, result2);
        assertArrayEquals(new int[]{}, result3);
        assertArrayEquals(new int[]{2, 4}, result4);
        assertArrayEquals(new int[]{0, 1}, result5);
        LOGGER.info(HYPHENS);
    }

    @Test
    void twoSumBruteForce() {
        LOGGER.info("Testing TwoSum Brute Force ");
        TwoSum ts = new TwoSum();
        int[] result1 = ts.twoSumBruteForce(new int[]{2, 7, 11, 15}, 9);
        int[] result2 = ts.twoSumBruteForce(new int[]{1, 2, 3}, 5);
        int[] result3 = ts.twoSumBruteForce(new int[]{1, 2, 3}, 7);
        int[] result4 = ts.twoSumBruteForce(new int[]{-1, -2, -3, -4, -5}, -8);
        int[] result5 = ts.twoSumBruteForce(new int[]{3, 3, 4, 4}, 6);

        LOGGER.info("Test case 1 - Input: [2, 7, 11, 15], Target: 9, Result: " + Arrays.toString(result1));
        LOGGER.info("Test case 2 - Input: [1, 2, 3], Target: 5, Result: " + Arrays.toString(result2));
        LOGGER.info("Test case 3 - Input: [1, 2, 3], Target: 7, Result: " + Arrays.toString(result3));
        LOGGER.info("Test case 4 - Input: [-1, -2, -3, -4, -5], Target: -8, Result: " + Arrays.toString(result4));
        LOGGER.info("Test case 5 - Input: [3, 3, 4, 4], Target: 6, Result: " + Arrays.toString(result5));
        assertArrayEquals(new int[]{0, 1}, result1);
        assertArrayEquals(new int[]{1, 2}, result2);
        assertArrayEquals(new int[]{}, result3);
        assertArrayEquals(new int[]{2, 4}, result4);
        assertArrayEquals(new int[]{0, 1}, result5);
        LOGGER.info(HYPHENS);
    }
}