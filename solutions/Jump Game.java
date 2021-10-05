class Solution {
    public boolean canJump(int[] nums) {
     boolean[] bool=new boolean[nums.length];
        for (int i = 0; i <nums.length-1 ; i++) {
            int th=Integer.min(nums.length-1,i+nums[i]);
            for (int j = i+1; j <=th ; j++) {
                bool[j]=true;
            }
        }
        for (int i = 1; i <bool.length ; i++) {
            if (!bool[i]){
                return false;
            }
        }
        return true;   
    }
}
class Solution {
    public boolean canJump(int[] nums) {
     boolean[] bool=new boolean[nums.length];
        for (int i = 0; i <nums.length-1 ; i++) {
            int th=Integer.min(nums.length-1,i+nums[i]);
            for (int j = i+1; j <=th ; j++) {
                bool[j]=true;
            }
        }
        for (int i = 1; i <bool.length ; i++) {
            if (!bool[i]){
                return false;
            }
        }
        return true;   
    }
}
