class Solution {
    public static int largest(int[] a) {
        int i;
        int max=a[0];
        for (i=1;i<a.length;i++) {
            if (a[i]>max) {
                max=a[i];
            }
        }
        return max;
    }
}
