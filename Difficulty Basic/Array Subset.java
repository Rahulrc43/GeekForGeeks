class Solution {
    /**
     * Checks if array b[] is a subset of array a[].
     * Uses a frequency map to correctly handle duplicates.
     * Time: O(m + n), Space: O(m) where m = a.length, n = b.length
     *
     * @param a the main array
     * @param b the array to check as a potential subset
     * @return true if every element of b (with multiplicity) appears in a, false otherwise
     * Example: a=[1,2,3,4], b=[1,2] → true; a=[1,2,2], b=[2,2,2] → false
     */
    public boolean isSubset(int a[], int b[]) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : a) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        for (int num : b) {
            if (!freq.containsKey(num) || freq.get(num) == 0) {
                return false;
            }
            freq.put(num, freq.get(num) - 1);
        }
        return true;
    }
}
