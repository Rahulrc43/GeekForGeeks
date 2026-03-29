class Solution {
    /**
     * Calculates the sum of all elements in the array.
     * Time: O(n), Space: O(1)
     *
     * @param arr the input array
     * @return sum of all elements, or 0 if the array is empty
     */
    int arraySum(int[] arr) {
        int sum = 0;
        for (int value : arr) {
            sum += value;
        }
        return sum;
    }
}
