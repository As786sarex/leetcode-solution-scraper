class Solution {
    public int arrayNesting(int[] nums) {
        Set<Integer> set=new HashSet<>();
        int mx=0,curr=0;
        for(int i=0;i<nums.length;++i){
            if(set.contains(nums[i]))
                continue;
            curr=0;
            int temp=nums[i];
            while(!set.contains(temp)){
                curr++;
                set.add(temp);
                temp=nums[temp];
            }
            mx=Integer.max(mx,curr);
        }
        return mx;
    }
}
