import java.util.*;

class Solution {
    public ArrayList<Integer> mergeNsort(int[] arr1, int[] arr2) {
        Set<Integer> set = new HashSet<>();
        
        for (int num : arr1) {
            set.add(num);
        }
        for (int num : arr2) {
            set.add(num);
        }
        
        ArrayList<Integer> result = new ArrayList<>(set);
        Collections.sort(result);
        
        return result;
    }
}
