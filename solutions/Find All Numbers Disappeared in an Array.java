class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> missing=new LinkedList<>();
        for(int x:nums){
            int temp=Math.abs(x);
            if(nums[temp-1]>0)
                nums[temp-1]=-nums[temp-1];
        }
        for(int i=0;i<nums.length;++i)
            if(nums[i]>0)
                missing.add(i+1);
        return missing;
    }
}
