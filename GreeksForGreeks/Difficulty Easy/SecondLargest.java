class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int n = arr.length;
        if (n < 2) 
        return -1;
        
        int largest = -1;
        int slargest = -1;
         for ( int num : arr){
             if ( num > largest){
             largest = num ;
             }
        
         }
         for ( int num : arr){
             if ( num > slargest && num < largest){
                 slargest = num;
                 
             }
         }
         return slargest;
         
    }
}