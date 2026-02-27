class Solution {
    long maxDays(int arr[]) {
        long max = 0;
        for (int size : arr) {
            if (size > max) {
                max = size;
            }
        }
        return max;
    }
}
