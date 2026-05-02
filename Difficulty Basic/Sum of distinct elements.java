class Solution {
    int findSum(int arr[]) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) set.add(num);
        int sum = 0;
        for (int num : set) sum += num;
        return sum;
    }
}
