class Solution {
    static int countPairs(int arr1[], int arr2[], int x) {
        int i = 0, j = arr2.length - 1, count = 0;
        while (i < arr1.length && j >= 0) {
            int sum = arr1[i] + arr2[j];
            if (sum == x) {
                count++;
                i++;
                j--;
            } else if (sum < x) {
                i++;
            } else {
                j--;
            }
        }
        return count;
    }
}
