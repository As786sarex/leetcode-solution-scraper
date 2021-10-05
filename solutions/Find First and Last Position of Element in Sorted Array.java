class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res=new int[2];
        Arrays.fill(res,-1);
        if(nums.length==0)
            return res;
        int left=binarySearch(nums,target);
        if(left<0||left>=nums.length||nums[left]!=target)
            return res;
        res[0]=left;
        int right=binarySearch1(nums,target);
        res[1]=right;
        return res;
    }
    
    private int binarySearch(int[] nums,int target){
        int lo=0,hi=nums.length-1;
        while(lo<hi){
            int mid=(lo+hi)>>1;
            if(mid>0&&nums[mid]==target&&nums[mid-1]!=target)
                return mid;
            if(nums[mid]<target)
                lo=mid+1;
            else if(nums[mid]>=target)
                hi=mid;
        }
        return hi;
    }
    
    private int binarySearch1(int[] nums,int target){
        int lo=0,hi=nums.length-1;
        while(lo<hi){
            int mid=(lo+hi)>>1;
            if(mid+1<nums.length&&nums[mid+1]!=target&&nums[mid]==target)
                return mid;
            if(nums[mid]<target)
                lo=mid+1;
            else if(nums[mid]>target)
                hi=mid-1;
            else if(mid+1<nums.length){
                if(nums[mid+1]==target)
                    lo=mid+1;
                else
                    return mid;
            } else
                return mid;
        }
        return hi;
    }
}
