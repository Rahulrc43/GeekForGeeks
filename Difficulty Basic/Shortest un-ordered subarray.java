class Solution {
    public int shortestUnorderedSubarray(int arr[]) {
        int n = arr.length;
        if (n < 3) return 0;

        boolean increasing = true, decreasing = true;

        for (int i = 1; i < n; i++) {
            if (arr[i] <= arr[i - 1]) increasing = false;
            if (arr[i] >= arr[i - 1]) decreasing = false;
        }

        if (increasing || decreasing) return 0;
        return 3;
    }
}
