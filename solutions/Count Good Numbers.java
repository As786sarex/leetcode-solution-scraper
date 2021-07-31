public class Solution {
    public int countGoodNumbers(long n) {
        long[] dp = new long[64];
        long mod = (long) (1e9 + 7);
        
        /* Base Condition */
        dp[0] = 5;
        dp[1] = 20;

        /* Precomputing f(2^N) */
        for (int i = 2; i < 64; i++) {
            long mask = 1L << i;
            if (mask > n)
                break;
            dp[i] = (dp[i-1]*dp[i-1]) % mod;
        }
        long result = 1;
        
        /* Getting answer from f(N) = ∏ f(2^(Set bit index)) */
        for (int i = 0; i < 64; i++) {
            long mask = 1L << i;
            if (mask > n)
                break;
            if ((n & mask) > 0)
                result = (result * dp[i]) % mod;
        }
        return (int) result;
    }
}
