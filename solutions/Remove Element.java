class Solution {
    public int removeElement(int[] nums, int k) {
        int left=0,right=nums.length-1;
        if(nums.length==1){
            if(nums[0]==k)
                return 0;
            return 1;
        }
        while(left<right){
             while(right>0&&nums[right]==k){
                  --right;
             }
             if(left<right&&nums[left]==k){
             int temp=nums[left];
             nums[left]=nums[right];
             nums[right]=temp;
             }
             ++left;
                
        }
        if(right>=0&&nums[right]==k)
            right--;
        return right+1;
    }
    
}
class Solution {
    public int removeElement(int[] nums, int k) {
        int left=0,right=nums.length-1;
        if(nums.length==1){
            if(nums[0]==k)
                return 0;
            return 1;
        }
        while(left<right){
             while(right>0&&nums[right]==k){
                  --right;
             }
             if(left<right&&nums[left]==k){
             int temp=nums[left];
             nums[left]=nums[right];
             nums[right]=temp;
             }
             ++left;
                
        }
        if(right>=0&&nums[right]==k)
            right--;
        return right+1;
    }
    
}
