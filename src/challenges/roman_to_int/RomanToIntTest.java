package challenges.roman_to_int;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanToIntTest {

    @Test
    public void shouldThrowsIllegalArgumentExceptionIfInputIsNull() {
        String input = null;

        int output = RomanToInt.romanToInt(input);

        Assertions.assertEquals(0, output);
    }

    @Test
    public void shouldThrowsIllegalArgumentExceptionifTheInputIsLessThanOne() {
        String input = "";

        int output = RomanToInt.romanToInt(input);

        Assertions.assertEquals(0, output);
    }

    @Test
    public void shouldThrowsIllegalArgumentExceptionifTheInputIsGreaterThanFifteen() {
        String input = "1234567890123456";

        int output = RomanToInt.romanToInt(input);

        Assertions.assertEquals(0, output);
    }

    @Test
    public void shouldReturnAnIllegalArgumentExceptionIfThereIsAnyCharacterThatIsNotFromTheRomanAlgorithm() {
        String input = "VIIZ";

        int output = RomanToInt.romanToInt(input);

        Assertions.assertEquals(0, output);
    }

    @Test
    public void theResultMustBeBetween1And3999() {
        String input = "MMMM";

        int output = RomanToInt.romanToInt(input);

        Assertions.assertEquals(0, output);
    }

    @Test
    public void shouldReturnAValidAlgarism() {
        String input = "MMCCIV";

        int output = RomanToInt.romanToInt(input);

        Assertions.assertEquals(2204, output);
    }
}
