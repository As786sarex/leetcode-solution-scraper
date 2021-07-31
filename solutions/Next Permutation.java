class Solution {
    public void nextPermutation(int[] nums) {
        int curr=0,right=0;
        for(curr=nums.length-1;curr>0;--curr){
            if(nums[curr]>nums[curr-1])
                break;
        }
        if(curr<=0){
            reverse(nums,0);
            return;
        }
        for(right=nums.length-1;right>=curr;--right){
            if(nums[right]>nums[curr-1]){
                int x=nums[right];
                nums[right]=nums[curr-1];
                nums[curr-1]=x;
                break;
            }
        }
        reverse(nums,curr);
    }
    
    private void reverse(int[] arr,int start){
        int end=arr.length-1;
        while(start<end){
            int x=arr[start];
            arr[start++]=arr[end];
            arr[end--]=x;
        }
    }
}
