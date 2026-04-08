class Solution {
    public static int specialIntegers(int n, int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        HashSet<Integer> special = new HashSet<>();
        for (int num : arr) {
            if (set.contains(num - 1) && set.contains(num + 1)) {
                special.add(num);
            }
        }

        return special.size();
    }
}


