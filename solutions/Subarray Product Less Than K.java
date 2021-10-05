class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int result = 1,left=0,right=0,ans=0;
        if(k<=1)
            return 0;
        for( right=0;right<nums.length;++right){
            result*=nums[right];
            while(result>=k)
                result/=nums[left++];
            ans+=(right-left+1);
        }
        return ans;
    }
}
