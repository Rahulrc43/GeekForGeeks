class Solution {
    /**
     * Finds the largest element in the array.
     * Time: O(n), Space: O(1)
     *
     * @param arr the input array (must be non-null and non-empty)
     * @return the largest element in the array
     * @throws IllegalArgumentException if the array is null or empty
     */
    public static int largest(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}