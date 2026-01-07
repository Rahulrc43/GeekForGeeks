class Solution {
    int missingNum(int[] arr) {
        int n = arr.length + 1;

        long expectedSum = (long) n * (n + 1) / 2;
        long actualSum = 0;

        for (int num : arr) {
            actualSum += num;
        }

        return (int) (expectedSum - actualSum);
    }
}
public class MissinfOfArray {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {1, 2, 4, 6, 3, 7, 8};
        int missingNumber = solution.missingNum(arr);
        System.out.println("The missing number is: " + missingNumber); // Output: The missing number is: 5
    }
}