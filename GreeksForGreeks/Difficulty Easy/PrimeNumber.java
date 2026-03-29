class Solution {
    /**
     * Checks whether a number is prime using the 6k±1 optimization.
     * All primes greater than 3 are of the form 6k ± 1.
     * Time: O(√n), Space: O(1)
     *
     * @param n the number to check
     * @return true if n is prime, false otherwise
     * Example: isPrime(17) → true, isPrime(18) → false
     */
    static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2 || n == 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        // Check divisors of the form 6k ± 1 up to √n
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }
}