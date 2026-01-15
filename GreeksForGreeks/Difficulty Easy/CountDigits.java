class Solution {
    static int evenlyDivides(int N) {
        int count=0;
        for (int n=N; n>0; n/=10) {
            int digit=n%10;
            if (digit!=0 && N%digit==0) 
            count++;
        }
        return count;
    }
}
