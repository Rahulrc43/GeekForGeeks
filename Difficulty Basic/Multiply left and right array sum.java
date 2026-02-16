class Solution {
    public int multiply(int[] arr) {
        int n = arr.length;
        int mid = n / 2;

        int leftSum = 0;
        int rightSum = 0;

        for (int i = 0; i < mid; i++) {
            leftSum += arr[i];
        }

        for (int i = mid; i < n; i++) {
            rightSum += arr[i];
        }

        return leftSum * rightSum;
    }
}
