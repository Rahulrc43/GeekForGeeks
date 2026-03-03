class Solution {
    public ArrayList<Integer> countArray(int[] arr, int x) {
        int n = arr.length;
        ArrayList<Integer> result = new ArrayList<>(n);
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        for (int i = 0; i < n; i++) {
            int avg = (arr[i] + x) / 2;
            result.add(freq.getOrDefault(avg, 0));
        }
        return result;
    }
}
