package challenges;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class TwoSumTest {

    @Test
    void shouldThrowAnErrorIfTheVectorLengthIsInvalid() {
        var nums = new int[] {0};
        var target = 0;

        Assertions.assertThrows(RuntimeException.class, () -> TwoSum.twoSum(nums, target));
    }

    @Test
    void shouldThrowAnErrorIfTheTargetValueIsInvalid() {
        var nums = new int[] {0, 0};
        var target = -1_000_000_001;

        Assertions.assertThrows(RuntimeException.class, () -> TwoSum.twoSum(nums, target));
    }

    @Test
    void shouldThrowAnErrorIfTheSomeVectorValueIsInvalid() {
        var nums = new int[] {0, 1_000_000_001};
        var target = 0;

        Assertions.assertThrows(RuntimeException.class, () -> TwoSum.twoSum(nums, target));
    }

    @Test
    void mustReturnTheIndicesThatTogetherAreEqualToTheTargetValue_test01() {
        var nums = new int[] {2, 7, 11, 15};
        var target = 9;
        var expected = new int[] {0, 1};

        var result = TwoSum.twoSum(nums, target);

        Assertions.assertEquals(Arrays.toString(expected), Arrays.toString(result));
    }

    @Test
    void mustReturnTheIndicesThatTogetherAreEqualToTheTargetValue_test02() {
        var nums = new int[] {3, 2, 4};
        var target = 6;
        var expected = new int[] {1, 2};

        var result = TwoSum.twoSum(nums, target);

        Assertions.assertEquals(Arrays.toString(expected), Arrays.toString(result));
    }

    @Test
    void mustReturnTheIndicesThatTogetherAreEqualToTheTargetValue_test03() {
        var nums = new int[] {3, 3};
        var target = 6;
        var expected = new int[] {0, 1};

        var result = TwoSum.twoSum(nums, target);

        Assertions.assertEquals(Arrays.toString(expected), Arrays.toString(result));
    }
}