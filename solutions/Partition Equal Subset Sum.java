class Solution {
    boolean f=false;
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int x:nums)
            sum+=x;
        if(sum%2!=0)
            return false;
        sum>>=1;
        
        byte[][] dp=new byte[nums.length][sum+1];
        return subsetSumK(nums,0,sum,dp);
    }
    
    boolean subsetSumK(int[] nums,int index,int target,byte[][] dp){
        if(f)
            return true;
        if(index==nums.length)
            return false;
        if(target<0)
            return false;
        if(dp[index][target]>0)
            return dp[index][target]==1;
        if(target==0){
            f=true;
            dp[index][target]=1;
            return true;
        }
        
        dp[index][target]=(byte)((subsetSumK(nums,index+1,target,dp
            )||subsetSumK(nums,index+1,target-nums[index],dp))?1:2);
        return dp[index][target]==1;
    }
}
