class Solution {
    public int countFibonacciNumbers(long[] arr) {
        int count = 0;
        for (long num : arr) {
            if (isFibonacci(num)) {
                count++;
            }
        }
        return count;
    }

    private boolean isFibonacci(long n) {
        return isPerfectSquare(5 * n * n + 4) || isPerfectSquare(5 * n * n - 4);
    }

    private boolean isPerfectSquare(long x) {
        long s = (long) Math.sqrt(x);
        return s * s == x;
    }
}
