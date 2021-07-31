class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum=nums[0],left=0,right=0,size=Integer.MAX_VALUE;
        while(right<nums.length){
            if(left==right&&sum>=target){
                return 1;
            } else if(sum>target){
                size=Integer.min(right-left+1,size);
                sum-=nums[left++];
            } else if(sum<target){
                if(right==nums.length-1){
                    break;
                }
                sum+=nums[++right];
            } else if(sum==target){
                size=Integer.min(right-left+1,size);
                if(right==nums.length-1){
                    break;
                }
                sum+=nums[++right];
            }
        }
        return size==Integer.MAX_VALUE?0:size;
    }
}
