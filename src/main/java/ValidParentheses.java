/**
 * leetcode.com/problems/valid-parentheses
 */

class ValidParentheses {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) return false;

        char[] stack = new char[s.length()];
        int ptr = 0;

        for (char c : s.toCharArray()) {
            switch (c) {
                case '(', '{', '[' -> stack[ptr++] = c;
                default -> {
                    if (ptr == 0) return false;
                    char top = stack[--ptr];
                    if ((top == '(' && c != ')') ||
                            (top == '[' && c != ']') ||
                            (top == '{' && c != '}')) {
                        return false;
                    }
                }
            }
        }
        return ptr == 0;
    }
}
