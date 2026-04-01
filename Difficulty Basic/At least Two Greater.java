class Solution {
    public long[] findElements(long arr[]) {
        Arrays.sort(arr);
        return Arrays.copyOfRange(arr, 0, arr.length - 2);
    }
}
