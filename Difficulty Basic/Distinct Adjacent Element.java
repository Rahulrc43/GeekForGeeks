class Solution {
    public boolean distinctAdjacentElement(int[] arr) {
        int n = arr.length;
        Map<Integer, Integer> freq = new HashMap<>();
        int maxFreq = 0;
        for (int x : arr) {
            freq.put(x, freq.getOrDefault(x, 0) + 1);
            maxFreq = Math.max(maxFreq, freq.get(x));
        }
        return maxFreq <= (n + 1) / 2;
    }
}
