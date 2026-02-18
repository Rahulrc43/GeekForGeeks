class Solution {
    public int calculateFriendliness(int[] arr) {
        int n = arr.length;
        int sum = 0;
        
        for (int i = 0; i < n; i++) {
            int next = arr[(i + 1) % n];
            sum += Math.abs(arr[i] - next);
        }
        
        return sum;
    }
}
