import java.util.HashMap;

/**
 * leetcode.com/problems/two-sum
 */

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int remainder = target - nums[i];
            if (map.containsKey(remainder)) {
                result[0] = map.get(remainder);
                result[1] = i;
                return result;
            }
            map.put(nums[i], i);
        }

        throw new IllegalArgumentException("No solution found");
    }
}
