class Solution {
    public boolean isIdentical(List<Integer> a, List<Integer> b) {
        if (a.size() != b.size()) return false;

        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : a) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        for (int num : b) {
            if (!freq.containsKey(num)) return false;
            freq.put(num, freq.get(num) - 1);
            if (freq.get(num) == 0) {
                freq.remove(num);
            }
        }

        return freq.isEmpty();
    }
}
