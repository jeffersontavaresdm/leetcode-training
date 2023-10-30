package challenges;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * <p>
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * <p>
 * You can return the answer in any order.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [2, 7, 11, 15], target = 9
 * Output: [0, 1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 * <p>
 * Example 2:
 * Input: nums = [3, 2, 4], target = 6
 * Output: [1, 2]
 * Explanation: Because nums[1] + nums[2] == 6, we return [1, 2].
 * <p>
 * Example 3:
 * Input: nums = [3, 3], target = 6
 * Output: [0, 1]
 * Explanation: Because nums[0] + nums[1] == 6, we return [0, 1].
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 2 <= nums.length <= 10⁴
 * -10⁹ <= nums[i] <= 10⁹
 * -10⁹ <= target <= 10⁹
 * Only one valid answer exists.
 */
public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        if (!(lengthIsValid(nums))) {
            throw new RuntimeException("invalid vector length");
        }

        var result = new int[] {};
        for (int i = 0; i < nums.length; i++) {
            if (valueIsNotValid(nums[i]) || valueIsNotValid(target)) {
                throw new RuntimeException("invalid value");
            }

            //...
        }

        return result;
    }

    private static boolean lengthIsValid(int[] nums) {
        return nums.length >= 2 && nums.length <= 10_000;
    }

    private static boolean valueIsNotValid(int value) {
        return value < -1_000_000_000 || value > 1_000_000_000;
    }
}