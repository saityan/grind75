/**
 * leetcode.com/problems/valid-anagram
 */

class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] freq = new int[26];

        for (int i = 0; i < s.length(); i++) {
            char cS = s.charAt(i);
            char cT = t.charAt(i);
            if (cS < 'a' || cS > 'z' || cT < 'a' || cT > 'z') {
                throw new IllegalArgumentException("method 'isAnagram supports English lowercase letters only");
            }
            freq[cS - 'a']++;
            freq[cT - 'a']--;
        }

        for (int count : freq) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
}
