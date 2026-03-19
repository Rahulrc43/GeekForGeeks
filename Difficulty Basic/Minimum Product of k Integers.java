class Solution {
    int minProduct(int arr[], int k) {
        final int MOD = 1000000007;
        Arrays.sort(arr);
        long product = 1;
        for (int i = 0; i < k && i < arr.length; i++) {
            product = (product * arr[i]) % MOD;
        }
        return (int) product;
    }
}
