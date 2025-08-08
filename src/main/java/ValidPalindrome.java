/**
 * leetcode.com/problems/valid-palindrome
 */

class ValidPalindrome {
    public boolean isPalindrome(String s) {
        int length = s.length();

        if (length < 2) {
            return true;
        }

        int left = 0, right = length - 1;
        while (left < right) {
            char a = s.charAt(left);
            char b = s.charAt(right);

            if (a >= 'A' && a <= 'Z') a += 32;
            if (b >= 'A' && b <= 'Z') b += 32;

            if (!(a >= 'a' && a <= 'z') && !(a >= '0' && a <= '9')) {
                left++;
            } else if (!(b >= 'a' && b <= 'z') && !(b >= '0' && b <= '9')) {
                right--;
            } else if (a != b) {
                return false;
            } else {
                left++;
                right--;
            }
        }
        return true;
    }
}
