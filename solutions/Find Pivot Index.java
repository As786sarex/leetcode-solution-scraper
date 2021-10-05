class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0;
        if(nums.length==1)
            return 0;
        for(int x:nums)
            sum+=x;
        int current=0;
        for(int i=0;i<nums.length;++i){
            if(current==(sum-current-nums[i]))
                return i;
            current+=nums[i];
        }
        
        return -1;
    }
}
class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0;
        if(nums.length==1)
            return 0;
        for(int x:nums)
            sum+=x;
        int current=0;
        for(int i=0;i<nums.length;++i){
            if(current==(sum-current-nums[i]))
                return i;
            current+=nums[i];
        }
        
        return -1;
    }
}
