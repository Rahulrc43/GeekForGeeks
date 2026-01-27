
class Solution {
    boolean check_elements(int arr[], int n, int A, int B) {
        Set<Integer> set = new HashSet<>();
        for (int i : arr) {
            set.add(i);
        }
        
        for (int i = A; i <= B; i++) { 
            if (!set.contains(i)) {
                return false;
            }
        }
        
        return true;
    }
}
