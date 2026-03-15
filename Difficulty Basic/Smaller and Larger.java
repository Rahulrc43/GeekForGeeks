class Solution {
    int[] getMoreAndLess(int[] arr, int target) {
        int n = arr.length;
        int lessOrEqual = upperBound(arr, target);
        int greaterOrEqual = n - lowerBound(arr, target);
        return new int[]{lessOrEqual, greaterOrEqual};
    }
    
    private int upperBound(int[] arr, int target) {
        int low = 0, high = arr.length;
        while (low < high) {
            int mid = (low + high) / 2;
            if (arr[mid] <= target) low = mid + 1;
            else high = mid;
        }
        return low;
    }
    
    private int lowerBound(int[] arr, int target) {
        int low = 0, high = arr.length;
        while (low < high) {
            int mid = (low + high) / 2;
            if (arr[mid] < target) low = mid + 1;
            else high = mid;
        }
        return low;
    }
}
