class Solution {
    public int jump(int[] nums) {
        int currentLevel=0,upto=0,result=0;
        if(nums.length==1)
            return 0;
        for(int i=0;i<nums.length;++i){
            upto=Integer.max(upto,i+nums[i]);
            if(upto>=nums.length-1)
                return ++result;
            if(i==currentLevel){
                ++result;
                currentLevel=upto;
            }
        }
        return result;
    }
}

class Solution {
    public int jump(int[] nums) {
        int currentLevel=0,upto=0,result=0;
        if(nums.length==1)
            return 0;
        for(int i=0;i<nums.length;++i){
            upto=Integer.max(upto,i+nums[i]);
            if(upto>=nums.length-1)
                return ++result;
            if(i==currentLevel){
                ++result;
                currentLevel=upto;
            }
        }
        return result;
    }
}

