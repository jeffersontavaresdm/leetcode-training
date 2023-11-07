package challenges.two_sum;

import java.util.HashMap;
import java.util.Map;

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
        if (lengthIsValid(nums) && !valueIsNotValid(target)) {
            Map<Integer, Integer> seen = new HashMap<>();

            for (int i = 0; i < nums.length; i++) {
                if (valueIsNotValid(nums[i])) {
                    throw new IllegalArgumentException("No valid value");
                }

                int complement = target - nums[i];

                if (seen.containsKey(complement)) {
                    return new int[] {seen.get(complement), i};
                }

                seen.put(nums[i], i);
            }
        }

        throw new IllegalArgumentException("Error because invalid array length or invalid target value");
    }

    private static boolean lengthIsValid(int[] nums) {
        return nums.length >= 2 && nums.length <= 10_000;
    }

    private static boolean valueIsNotValid(int value) {
        return value < -1_000_000_000 || value > 1_000_000_000;
    }
}