class Solution {
    public int maxScore(int[] nums, int k) {
        int result=0,sz=nums.length;
        for(int i=1;i<sz;++i){
            nums[i]+=nums[i-1];
        }
        if(sz<=k)
            return nums[sz-1];
        int left=sz-k;
        result=(nums[sz-1]-nums[left-1]);
        int total=nums[sz-1];
        for(int i=0;i<k;++i){
            result=Integer.max(total+nums[i]-nums[left++],result);
        }
        return result;
    }
}
