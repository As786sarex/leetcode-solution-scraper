class Solution {
    public int numRollsToTarget(int n, int faces, int target) {
        int MOD = 1000000007;
        if (target < n)
            return 0;
    
        int[][] dp = new int[n+1][target + 1];

        dp[0][0]=1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= target; j++) {
                if(target>faces*n) break;
                for (int k = 1; k <= faces; k++) {
                    if (j - k >= 0)
                        dp[i][j] = (dp[i][j] + dp[i - 1][j - k]) % MOD;
                }
            }
        }
        return dp[n ][target];
    }
}
class Solution {
    public int numRollsToTarget(int n, int faces, int target) {
        int MOD = 1000000007;
        if (target < n)
            return 0;
    
        int[][] dp = new int[n+1][target + 1];

        dp[0][0]=1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= target; j++) {
                if(target>faces*n) break;
                for (int k = 1; k <= faces; k++) {
                    if (j - k >= 0)
                        dp[i][j] = (dp[i][j] + dp[i - 1][j - k]) % MOD;
                }
            }
        }
        return dp[n ][target];
    }
}
