class Solution {
    public int findLongestChain(int[][] pairs) {
        int n=pairs.length;
        int[] dp=new int[n+1];
        
        Arrays.fill(dp,1);
        int max=1;
        Arrays.sort(pairs,(a,b)->{
            return a[0]-b[0]==0?a[1]-b[1]:a[0]-b[0];
        });
        
        for(int i=1;i<n;++i){
            for(int j=0;j<i;++j){
                if(pairs[i][0]>pairs[j][1])
                    dp[i]=Integer.max(dp[i],dp[j]+1);
                max=Integer.max(max,dp[i]);
            }
        }
        
        return max;
    }
}
class Solution {
    public int findLongestChain(int[][] pairs) {
        int n=pairs.length;
        int[] dp=new int[n+1];
        
        Arrays.fill(dp,1);
        int max=1;
        Arrays.sort(pairs,(a,b)->{
            return a[0]-b[0]==0?a[1]-b[1]:a[0]-b[0];
        });
        
        for(int i=1;i<n;++i){
            for(int j=0;j<i;++j){
                if(pairs[i][0]>pairs[j][1])
                    dp[i]=Integer.max(dp[i],dp[j]+1);
                max=Integer.max(max,dp[i]);
            }
        }
        
        return max;
    }
}
