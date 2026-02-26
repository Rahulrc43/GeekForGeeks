class Solution {
    public int[] dupLastIndex(int[] arr) {
        int n = arr.length;
        int lastIndex = -1;
        int lastValue = -1;

        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1]) {
                lastIndex = i;
                lastValue = arr[i];
            }
        }

        return new int[]{lastIndex, lastValue};
    }
}
