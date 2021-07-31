class Solution {
    private final long mod = (long) (1e9 + 7);

    public int countVowelPermutation(int n) {
        long[][] dp = new long[n + 1][5];
        for (int i = 0; i < 5; i++) {
            dp[1][i] = 1;
        }
        for (int i = 2; i <= n; i++) {
            for (int j = 0; j < 5; j++) {
                if (j == 0)
                    dp[i][j] = (dp[i - 1][1] + dp[i - 1][2] + dp[i - 1][4]) % 
                        mod;
                else if (j == 1)
                    dp[i][j] = (dp[i - 1][0] + dp[i - 1][2]) % mod;
                else if (j == 2)
                    dp[i][j] = (dp[i - 1][1] + dp[i - 1][3]) % mod;
                else if (j == 3)
                    dp[i][j] = (dp[i - 1][2]) % mod;
                else
                    dp[i][j] = (dp[i - 1][2] + dp[i - 1][3]) % mod;
            }
        }
        long res = 0;
        for (int i = 0; i < 5; i++) {
            res = (res + dp[n][i]) % mod;
        }
        return (int) res;
    }
}
