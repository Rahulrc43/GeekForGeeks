class Solution {
    /**
     * Checks whether two strings are anagrams of each other.
     * Assumes lowercase English letters only.
     * Time: O(n), Space: O(1) — fixed-size array of 26 letters
     *
     * @param s1 the first string
     * @param s2 the second string
     * @return true if s1 and s2 are anagrams, false otherwise
     * Example: "listen" and "silent" → true
     */
    public static boolean areAnagrams(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        int[] freq = new int[26];
        for (char c : s1.toCharArray()) freq[c - 'a']++;
        for (char c : s2.toCharArray()) freq[c - 'a']--;
        for (int f : freq) if (f != 0) return false;
        return true;
    }
}
