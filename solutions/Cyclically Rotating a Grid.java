class Solution {
    void rotateOne(int[][] A, int M, int N, int k) {
        int temp = A[k][k];
        for (int j = k; j <= N - k - 2; ++j)
            A[k][j] = A[k][j + 1];

        int temp2 = A[M - 1 - k][k];

        for (int i = M - 1 - k; i >= k + 2; --i)
            A[i][k] = A[i - 1][k];
        A[k + 1][k] = temp;


        temp = A[M - 1 - k][N - 1 - k];

        for (int j = N - 1 - k; j >= k + 2; --j)
            A[M - 1 - k][j] = A[M - 1 - k][j - 1];
        A[M - 1 - k][k + 1] = temp2;

        for (int i = k; i <= M - 3 - k; ++i)
            A[i][N - 1 - k] = A[i + 1][N - 1 - k];
        A[M - 2 - k][N - 1 - k] = temp;
    }

    void rotateMatrix(int[][] A, int M, int N, int R) {
        int small = M;
        if (N < M) small = N;
        int t = 0;
        if (small % 2 == 0) t = small / 2;
        else t = small / 2 + 1;

        for (int k = 0; k < t; ++k) {
            int r = R % (2 * M + 2 * N - 8 * k - 4);
            while (r-- > 0) rotateOne(A, M, N, k);
        }
    }

    public int[][] rotateGrid(int[][] grid, int k) {
        int m = grid.length, n = grid[0].length;
        rotateMatrix(grid, m, n, k);
        return grid;
    }
    
}
