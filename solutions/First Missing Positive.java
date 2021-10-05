class Solution {
    
    private int MAX_VAL= (int)1e6;
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;++i){
            if(nums[i]<=0)
                nums[i]=MAX_VAL;
        }
        for(int i=0;i<n;++i){
            //check if current number is greater than n
            if(nums[i]>n||(-nums[i])>n)
                continue;
            int posIndex=nums[i];
            
            // check if the current index is already negetive
            if(nums[i]<0)
                posIndex=-posIndex;
            //check if we have already set this to negetive (duplicate case)
            if(nums[posIndex-1]<0)
                continue;
            nums[posIndex-1]*=-1;
        }
        for(int i=0;i<n;++i){
            if(nums[i]>=0)
                return i+1;
        }
        return n+1;
    }
}
