class Solution {
    public boolean isMatch(String s, String matcher) {
        int m = s.length();
        int n = matcher.length();
        byte[][] dp = new byte[m + 1][n + 1];
        return wildcardMatch(s, matcher, dp, m, n) > 1;
    }

    private byte wildcardMatch(String slug, String pattern, byte[][] dp, int m
        , int n){
        if (dp[m][n] > 0)
            return dp[m][n];
        if (m == 0 && n == 0)
            return (dp[m][n] = 2);
        else if (n == 0)
            return (dp[m][n] = 1);
        else if (m == 0 && pattern.charAt(n - 1) == '*')
            return dp[m][n] = wildcardMatch(slug,pattern,dp,m,n-1);
        else if (m == 0)
            return dp[m][n] = 1;
        if (pattern.charAt(n - 1) == '*')
            return dp[m][n] = (byte) (wildcardMatch(slug, pattern, dp, m, n - 
                1) | wildcardMatch(slug, pattern, dp, m - 1, n));
        else if (pattern.charAt(n - 1) == '?')
            return dp[m][n] = wildcardMatch(slug, pattern, dp, m - 1, n - 1);
        else if (pattern.charAt(n - 1) == slug.charAt(m - 1))
            return dp[m][n] = wildcardMatch(slug, pattern, dp, m - 1, n - 1);
        else
            return dp[m][n]=1;
    }
}
