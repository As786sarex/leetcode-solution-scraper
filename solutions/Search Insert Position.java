class Solution {
    public int searchInsert(int[] nums, int target) {
        int l=0,r=nums.length;
        if(target > nums[nums.length-1])
            return nums.length;
        if(target < nums[0])
            return 0;

        while(l<r){
            int mid=(l+r)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid-1] < target && nums[mid] > target)
                return mid;
            else if(nums[mid]<target)
                l=mid+1;
            else
                r=mid;
        }
        return l;
    }
}
