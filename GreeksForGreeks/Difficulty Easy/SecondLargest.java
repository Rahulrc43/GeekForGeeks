class Solution {
    /**
     * Finds the second largest distinct element in the array.
     * Uses a single-pass approach with two tracking variables.
     * Time: O(n), Space: O(1)
     *
     * @param arr the input array
     * @return the second largest distinct element, or -1 if fewer than 2 distinct elements exist
     */
    public int getSecondLargest(int[] arr) {
        int n = arr.length;
        if (n < 2) return -1;

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        return secondLargest == Integer.MIN_VALUE ? -1 : secondLargest;
    }
}