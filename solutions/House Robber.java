class Solution {
    public int rob(int[] nums) {
        int[] dp=new int[nums.length+1];
        if(nums.length==1)
            return nums[0];
        else if(nums.length==2)
            return Integer.max(nums[0],nums[1]);
        dp[0]=nums[0];
        dp[1]=nums[1];
        for(int i=2;i<nums.length;++i){
            for(int j=0;j<i-1;++j){
                dp[i]=Integer.max(Integer.max(dp[j]+nums[i],dp[i-1]),dp[i]);
            }
        }
    
        return dp[nums.length-1];
    }
}
