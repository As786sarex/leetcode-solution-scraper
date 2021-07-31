class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int x=(nums.length/2),result=0;
        for(int i=0;i<x;++i){
            result=Integer.max(result,(nums[i]+nums[nums.length-i-1]));
        }
        return result;
    }
}
