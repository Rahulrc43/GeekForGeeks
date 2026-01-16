class Solution {
    public int findIndex(int arr[], int x) {
        int ans = -1;
        for (int i = 0 ; i < arr.length; i++){
            if (arr[i] == x) {
                ans = i;
        }
    }
    return (ans == -1) ? -1 : ans + 1;
    }
}