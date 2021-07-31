class Solution {
    public boolean checkPossibility(int[] nums) {
        int p=0;
        boolean flag=false;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                if(flag)
                    return false;
                p=i;
                flag=true;
            }
        }
        return (p == 0 || p == nums.length-2 ||
                nums[p-1] <= nums[p+1] || nums[p] <= nums[p+2]);
        
    }
}
