class Solution {
    /**
     * Counts the number of digits in N that evenly divide N.
     * Time: O(d) where d is the number of digits in N, Space: O(1)
     *
     * @param N the input number (must be positive)
     * @return count of digits in N that evenly divide N
     * Example: N=128 → digits 1 and 2 divide 128, so return 2
     */
    static int evenlyDivides(int N) {
        int count = 0;
        for (int n = N; n > 0; n /= 10) {
            int digit = n % 10;
            if (digit != 0 && N % digit == 0) {
                count++;
            }
        }
        return count;
    }
}
