class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int size=nums.length;
        int right=nums[0]*nums[1];
        int left=nums[size-1]*nums[size-2];
        return left-right;
    }
}
class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int size=nums.length;
        int right=nums[0]*nums[1];
        int left=nums[size-1]*nums[size-2];
        return left-right;
    }
}
