class Solution {
    /**
     * Calculates the "friendliness" of an array — the sum of absolute differences
     * between each element and its circular neighbour.
     * Time: O(n), Space: O(1)
     *
     * @param arr the input array
     * @return sum of |arr[i] - arr[(i+1) % n]| for all i
     * Example: [1, 3, 2] → |1-3| + |3-2| + |2-1| = 4
     */
    public int calculateFriendliness(int[] arr) {
        int n = arr.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int next = arr[(i + 1) % n]; // wraps around to first element for last index
            sum += Math.abs(arr[i] - next);
        }

        return sum;
    }
}
