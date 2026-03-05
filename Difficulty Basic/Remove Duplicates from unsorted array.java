class Solution {
    static ArrayList<Integer> removeDuplicate(int arr[]) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int num : arr) set.add(num);
        return new ArrayList<>(set);
    }
}
