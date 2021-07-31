class Solution {
    public int[] buildArray(int[] nums) {
        int[] buffer=new int[nums.length];
        int x=0;
        for(int i:nums){
            buffer[x++]=nums[i];
        }
        return buffer;
    }
}
