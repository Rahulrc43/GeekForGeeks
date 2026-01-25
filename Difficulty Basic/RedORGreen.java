class Solution {
    static int RedOrGreen(int N, String S) {
        int countR = 0;
        int countG = 0;
        
        for (int i = 0; i < N; i++) {
            if (S.charAt(i) == 'R') {
                countR++;
            } else {
                countG++;
            }
        }
        
        return Math.min(countR, countG);
    }
}
