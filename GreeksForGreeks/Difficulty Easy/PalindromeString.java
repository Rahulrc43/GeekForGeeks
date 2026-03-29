class Solution {
    /**
     * Checks whether the given string is a palindrome.
     * A string is a palindrome if it reads the same forwards and backwards.
     * Time: O(n), Space: O(1)
     *
     * @param s the input string
     * @return true if s is a palindrome, false otherwise
     * Example: "racecar" → true, "hello" → false
     */
    boolean isPalindrome(String s) {
        int n = s.length();
        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }
}