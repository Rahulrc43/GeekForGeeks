class Solution {
    /**
     * Finds the missing number from an array containing integers in range [1, n+1]
     * where n is the length of the array (one number is absent).
     * Uses the mathematical formula: sum of first n integers = n*(n+1)/2.
     * Time: O(n), Space: O(1)
     *
     * @param arr the input array of length n with one missing number in [1, n+1]
     * @return the missing number
     * Example: [1,2,4,6,3,7,8] → 5
     */
    int missingNum(int[] arr) {
        int n = arr.length + 1;
        long expectedSum = (long) n * (n + 1) / 2;
        long actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }
        return (int) (expectedSum - actualSum);
    }
}

public class MissinfOfArray {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {1, 2, 4, 6, 3, 7, 8};
        int missingNumber = solution.missingNum(arr);
        System.out.println("The missing number is: " + missingNumber); // Output: 5
    }
}