package challenges.palindrome;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromeTest {

    @Test
    public void notShouldBeValid_01() {
        int input = 2147483647;

        boolean output = Palimdrome.isPalindrome(input);

        Assertions.assertFalse(output);
    }

    @Test
    public void zeroShouldBePalindromo() {
        int input = 0;
        boolean output = Palimdrome.isPalindrome(input);

        Assertions.assertTrue(output);
    }

    @Test
    public void shouldBePalindrome() {
        int input = 121;
        boolean output = Palimdrome.isPalindrome(input);

        Assertions.assertTrue(output);
    }

    @Test
    public void shouldNotBePalindrome() {
        int input = 123;
        boolean output = Palimdrome.isPalindrome(input);

        Assertions.assertFalse(output);
    }

    @Test
    public void test() {
        int input = -121;
        boolean output = Palimdrome.isPalindrome(input);

        Assertions.assertFalse(output);
    }
}
