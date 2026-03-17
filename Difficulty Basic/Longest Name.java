class Solution {
    public String longest(List<String> arr) {
        String longest = arr.get(0);
        for (String name : arr) {
            if (name.length() > longest.length()) {
                longest = name;
            }
        }
        return longest;
    }
}
