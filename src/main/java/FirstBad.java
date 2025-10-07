/**
 * leetcode.com/problems/first-bad-version
 */

class FirstBad {
    public int firstBadVersion(int n) {
        int left = 0;
        int right = n;
        int res = n;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (isBadVersion(mid)) {
                res = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return res;
    }

    private boolean isBadVersion(int n) {
        return Math.random() >= 0.5;
    }
}
