import java.util.*;

class Solution {
    /**
     * Finds all duplicate elements in an array where each element is in range [1, n].
     * Uses an in-place mark-as-negative technique to detect duplicates.
     * NOTE: This method modifies the input array.
     * Time: O(n), Space: O(1) excluding the result list
     *
     * @param arr the input array with elements in range [1, n]
     * @return list of all duplicate elements
     * Example: [1, 1, 2, 2] → [1, 2]
     */
    public List<Integer> findDuplicates(int[] arr) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            // Use element value as index (values are 1-based, so subtract 1)
            int index = Math.abs(arr[i]) - 1;
            if (arr[index] < 0) {
                // Already visited this index — it's a duplicate
                result.add(index + 1);
            } else {
                // Mark as visited by negating
                arr[index] = -arr[index];
            }
        }
        return result;
    }
}
