class Solution {
    ArrayList<Integer> arranged(ArrayList<Integer> arr) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        
        for (int num : arr) {
            if (num >= 0) pos.add(num);
            else neg.add(num);
        }
        
        ArrayList<Integer> result = new ArrayList<>();
        int i = 0, j = 0;
        
        while (i < pos.size() && j < neg.size()) {
            result.add(pos.get(i++));
            result.add(neg.get(j++));
        }
        
        return result;
    }
}
