class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] dp=new int[nums.length+1];
        Arrays.fill(dp,1);
        int max=1;
        for(int i=1;i<nums.length;++i){
            for(int j=0;j<i;++j){
                if(nums[i]>nums[j]){
                    dp[i]=Integer.max(dp[i],dp[j]+1);
                    
                max=Integer.max(max,dp[i]);
                }
            }
        }
        return max;
    }
}
class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] dp=new int[nums.length+1];
        Arrays.fill(dp,1);
        int max=1;
        for(int i=1;i<nums.length;++i){
            for(int j=0;j<i;++j){
                if(nums[i]>nums[j]){
                    dp[i]=Integer.max(dp[i],dp[j]+1);
                    
                max=Integer.max(max,dp[i]);
                }
            }
        }
        return max;
    }
}
