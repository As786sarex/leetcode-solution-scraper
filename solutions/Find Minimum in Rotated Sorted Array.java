class Solution {
    public int findMin(int[] nums) {
        int left=0,right=nums.length-1;
        int leftMost=nums[0];
        if(nums[0]<=nums[right])
            return nums[0];
        while(left<right){
            int mid=(left+right)/2;
            if(nums[mid]>=leftMost){
                left=mid+1;
            } else{
                right=mid;
            }
        }
        return nums[right];
    }
}
