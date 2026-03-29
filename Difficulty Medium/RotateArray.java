class Solution {
    /**
     * Left rotates an array by d positions using the three-reversal technique.
     * This avoids using extra space by reversing sub-arrays in-place.
     * Time: O(n), Space: O(1)
     *
     * @param arr the array to rotate
     * @param d   the number of positions to rotate left (handles d > n via modulo)
     * Example: [1,2,3,4,5], d=2 → [3,4,5,1,2]
     */
    static void rotateArr(int arr[], int d) {
        int n = arr.length;
        d = d % n; // handle cases where d >= n
        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n - 1);
    }

    /**
     * Reverses a portion of the array between indices start and end (inclusive).
     */
    static void reverse(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}