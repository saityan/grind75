/**
 * leetcode.com/problems/binary-search
 */

class BinarySearch {
    public int search(int[] nums, int target) {
        if (nums.length  == 0) return -1;

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (nums[middle] == target) {
                return middle;
            } else if (nums[middle] > target) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }

        return -1;
    }
}
