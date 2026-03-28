class Solution {
    public void swapKth(List<Integer> arr, int k) {
        int n = arr.size();
        int firstIndex = k - 1;
        int secondIndex = n - k;
        int temp = arr.get(firstIndex);
        arr.set(firstIndex, arr.get(secondIndex));
        arr.set(secondIndex, temp);
    }
}
