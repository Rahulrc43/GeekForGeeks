class Solution {
    /**
     * Searches for value x in a matrix using a brute-force scan.
     * Time: O(m * n), Space: O(1)
     *
     * @param mat the 2D matrix to search in
     * @param x   the value to search for
     * @return true if x is found in the matrix, false otherwise
     */
    public boolean searchMatrix(int[][] mat, int x) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == x) {
                    return true;
                }
            }
        }
        return false;
    }
}
