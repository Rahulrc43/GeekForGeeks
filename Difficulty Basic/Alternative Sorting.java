class Solution {
    public static ArrayList<Integer> alternateSort(int[] arr) {
        Arrays.sort(arr);
        ArrayList<Integer> result = new ArrayList<>();
        int left = 0, right = arr.length - 1;
        
        while (left <= right) {
            if (left != right) {
                result.add(arr[right--]); // largest
                result.add(arr[left++]);  // smallest
            } else {
                result.add(arr[left]);    // middle element if odd length
                break;
            }
        }
        return result;
    }
}
