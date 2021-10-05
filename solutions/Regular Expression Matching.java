class Solution {
   public boolean isMatch(String s, String p) {
        int m = s.length(), n = p.length(), ind = 0;
        byte[][] dp = new byte[m + 1][n + 1];
        dp[0][0] = 2;
        char[] pattern = new char[n];
        for (int i = 0; i < n; ++i) {
            if (i + 1 < n && p.charAt(i + 1) == '*') {
                pattern[ind++] = (char) (p.charAt(i) == '.' ? 0 : (p.charAt(i) 
                    - 'a' + 1));
                ++i;
            } else
                pattern[ind++] = p.charAt(i);
        }
        boolean b = match(s, pattern, dp, m, ind) > 1;
        return b;
    }

    private byte match(String s, char[] pattern, byte[][] dp, int start, int 
        end) {
        if (start == 0 && end == 0)
            return 2;
        if (dp[start][end] > 0)
            return dp[start][end];
        if (end == 0)
            return dp[start][end] = 1;
        if (start == 0)
            return dp[start][end] = pattern[end - 1] < '.' ? match(s,pattern
                ,dp,start,end-1) : 1;

        if (pattern[end - 1] == s.charAt(start - 1) || pattern[end - 1] == '.'
            )
            return dp[start][end] = match(s,pattern,dp,start-1,end-1);
        else if (pattern[end - 1] == 0)
            return dp[start][end] = (byte) (match(s, pattern, dp, start - 1, 
                end) | match(s, pattern, dp, start, end - 1));
        else if (pattern[end - 1] < '.')
            return dp[start][end] = (byte) (match(s, pattern, dp, start, end-1
                ) | ((pattern[end - 1] == (s.charAt(start - 1) - 'a' + 1)) ? 2 
                : 1) & match(s, pattern, dp, start-1, end));
        else
            return dp[start][end] = 1;
    }
}
