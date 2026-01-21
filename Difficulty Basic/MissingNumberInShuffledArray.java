

class Solution {

    public int findMissing(int[] arr1, int[] arr2) {
        int sum1 = 0, sum2 =0;
        for(int num :arr1){
            sum1 += num;
        }
        for(int num :arr2){
            sum2 += num;
        }
        return sum1 -  sum2;

        
    }
}