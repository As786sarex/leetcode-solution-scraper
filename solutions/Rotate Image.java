class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int r = (int) Math.ceil((double) n / 2.0);
        int c = n / 2;
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n - 1 - j][i];
                matrix[n - 1 - j][i] = matrix[n - 1 - i][n - 1 - j];
                matrix[n - 1 - i][n - 1 - j] = matrix[j][n - 1 - i];
                matrix[j][n - 1 - i] = temp;
            }
        }

    }
}
