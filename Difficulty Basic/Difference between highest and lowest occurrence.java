class Solution {
    public int findDiff(int[] arr) {
        Map<Integer, Integer> freq = new HashMap<>();
        
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        
        if (freq.size() == 1) return 0;
        
        int maxFreq = Collections.max(freq.values());
        int minFreq = Collections.min(freq.values());
        
        return maxFreq - minFreq;
    }
}
