class Solution {
    public boolean isPerfect(int[] arr) {
        int n = arr.length;
        int i = 1;
        while (i < n && arr[i] > arr[i - 1]) i++;
        while (i < n && arr[i] == arr[i - 1]) i++;
        while (i < n && arr[i] < arr[i - 1]) i++;
        return i == n;
    }
}
