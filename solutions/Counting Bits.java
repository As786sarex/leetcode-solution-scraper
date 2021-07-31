class Solution {
    public int[] countBits(int n) {
        
        int[] dp=new int[n+1];
        if(n==0)
            return dp;
        dp[1]=1;
        int l=n/2;
        for(int i=1;i<=l;i++){
            int after=(i<<1);
            if(after<=n)
                dp[after]=dp[i];
            if(after<n)
                dp[after+1]=dp[i]+1;
        }
        return dp;
    }
}
