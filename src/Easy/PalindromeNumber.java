package Easy;

public class PalindromeNumber {
    // Time O(n), space: O(1)
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int original = x;
        int reversed = 0;

        while (x != 0 ) {
            int pop = x % 10;
            x /= 10;

            // 2147483647 -> 214748364 (edge case 2147483647 = 214748364 * 10  + 7 )
            if (reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && pop > 7)) {
                return false;
            }
            reversed = reversed * 10 + pop;
        }

        return original == reversed;
    }
}
