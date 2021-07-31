class Solution {
    public int maxSubArray(int[] nums) {
        int global_max=Integer.MIN_VALUE,local=0;
        for(int i=0;i<nums.length;i++){
            local=local+nums[i];
            
            global_max=Integer.max(global_max,local);
            local=Integer.max(local,0);
        }
        return global_max;
    }
}
