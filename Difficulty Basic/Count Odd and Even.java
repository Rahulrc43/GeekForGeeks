class Solution {
    public int[] countOddEven(int[] arr) {
        int odd = 0, even = 0;
        for (int num : arr) {
            if (num % 2 == 0) even++;
            else odd++;
        }
        return new int[]{odd, even};
    }
}
