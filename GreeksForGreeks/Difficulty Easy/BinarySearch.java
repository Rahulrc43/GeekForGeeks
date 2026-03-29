class Solution {
    /**
     * Finds the first (leftmost) occurrence of key k in a sorted array using binary search.
     * Time: O(log n), Space: O(1)
     *
     * @param arr the sorted input array
     * @param k   the target value to search for
     * @return the index of the first occurrence of k, or -1 if not found
     * Example: arr=[1,2,2,2,3], k=2 → 1
     */
    public int binarysearch(int[] arr, int k) {
        int low = 0, high = arr.length - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == k) {
                result = mid;
                high = mid - 1; // search left for first occurrence
            } else if (arr[mid] < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }
}