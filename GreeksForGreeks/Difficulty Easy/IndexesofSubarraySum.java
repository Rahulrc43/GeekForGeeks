import java.util.*;

class Solution {
    /**
     * Finds the start and end indexes (1-based) of the first subarray whose sum equals the target.
     * Uses a sliding window approach.
     * Time: O(n), Space: O(1)
     *
     * @param arr    the input array of non-negative integers
     * @param target the target sum to find
     * @return list with [start, end] (1-based), or [-1] if no such subarray exists
     * Example: arr=[1,2,3,7,5], target=12 → [2, 4]
     */
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length, j = 0, sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            while (sum > target && j < i) {
                sum -= arr[j++];
            }
            if (sum == target) {
                ans.add(j + 1);
                ans.add(i + 1);
                return ans;
            }
        }
        ans.add(-1);
        return ans;
    }
}