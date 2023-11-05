package challenges.palindrome;

/**
 * Given an integer x, return true if x is a palindrome, and false otherwise.
 * <p>
 * Example 1:
 * Input: x = 121
 * Output: true
 * Explanation: 121 reads as 121 from left to right and from right to left.
 * <p>
 * Example 2:
 * Input: x = -121
 * Output: false
 * Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
 * <p>
 * Example 3:
 * Input: x = 10
 * Output: false
 * Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 * <p>
 * Constraints:
 * -2³¹ <= x <= 2³¹ - 1
 */
public class Palimdrome {

    public static boolean isPalindrome(int x) {
        if (isNotValid(x)) {
            throw new IllegalArgumentException("value is not valid");
        }

        return x >= 0 && reverseNumber(x) == x;
    }

    private static int reverseNumber(int number) {
        int invertedNumber = 0;

        while (number != 0) {
            int lastDigit = number % 10;
            invertedNumber = (invertedNumber * 10) + lastDigit;
            number = number / 10;
        }

        return invertedNumber;
    }

    private static boolean isNotValid(int x) {
        int min = (int) Math.pow(-2, 31);
        int max = (int) Math.pow(2, 31);
        return !(min <= x && x <= max);
    }
}