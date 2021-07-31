class Solution {
    public int search(int[] nums, int target) {
        if(nums.length==1)
            return nums[0]==target?0:-1;
        int pivot=0;
        if(nums[0]>=nums[nums.length-1])
            pivot=binarySearch(nums,((arr,a,b,c)->arr[a]>=arr[b]),0,nums
                .length-1,target);
        int result=binarySearch(nums,(arr,a,b,c)->arr[a]<c,pivot,pivot+nums
            .length-1,target);
        result%=nums.length;
        if(result>=nums.length||result<0)
            return -1;
        else if(nums[result]!=target)
            return -1;
        return result;
    }
    
    
    private int binarySearch(int[] nums,Predicate p,int start,int end,int 
        target){
        int left=start,right=end,sz=nums.length;
        while(left<right){
            int preMid=(left+right)/2;
            int mid=preMid%sz;
            if(p.test(nums,mid,start,target))
                left=preMid+1;
            else
                right=preMid;
        }
        return right;
    }
    
}

interface Predicate{
    boolean test(int[] nums,int a,int b,int c);
}
