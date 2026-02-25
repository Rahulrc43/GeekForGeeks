
class Solution {
    public ArrayList<Integer> maxAdj(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.length - 1; i++) {
            result.add(Math.max(arr[i], arr[i + 1]));
        }
        return result;
    }
}
