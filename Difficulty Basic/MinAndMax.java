class Solution {
    /**
     * Finds both the minimum and maximum elements in the array in a single pass.
     * Time: O(n), Space: O(1)
     *
     * @param arr the input array (must be non-empty)
     * @return an ArrayList where index 0 is the minimum and index 1 is the maximum
     */
    public ArrayList<Integer> getMinMax(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        int min = arr[0];
        int max = arr[0];

        // Start from index 1 since min/max are initialized with arr[0]
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        result.add(min);
        result.add(max);
        return result;
    }
}
