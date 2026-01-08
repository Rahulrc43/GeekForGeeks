class Solution {
    boolean isPalindrome(String s){
    int i,n=s.length();
    for(i=0;i<n;i++){
        if(s.charAt(i)!=s.charAt(n-i-1)){
            return false;
    }
    }   
     return true;
}
}