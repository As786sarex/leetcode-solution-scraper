class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        if(nums.length==0)
            return result;
        Arrays.sort(nums);
        int sz=nums.length;
        for(int i=0;i<sz;++i){
            int left=i+1,right=sz-1;
            if(nums[i]>0)
                break;
            if (i > 0 && nums[i] == nums[i-1]) continue;
            while(left<right){
                int temp=nums[i]+nums[left]+nums[right];
                if(temp>0)
                    --right;
                else if(temp<0)
                    ++left;
                else{
                    result.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    int last_left = nums[left], last_right = nums[right];
                    while (left < right && nums[left] == last_left) ++left;
                    while (left < right && nums[right] == last_right) --right;
                }
            }
        }
        return result;
        
    }
}
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        if(nums.length==0)
            return result;
        Arrays.sort(nums);
        int sz=nums.length;
        for(int i=0;i<sz;++i){
            int left=i+1,right=sz-1;
            if(nums[i]>0)
                break;
            if (i > 0 && nums[i] == nums[i-1]) continue;
            while(left<right){
                int temp=nums[i]+nums[left]+nums[right];
                if(temp>0)
                    --right;
                else if(temp<0)
                    ++left;
                else{
                    result.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    int last_left = nums[left], last_right = nums[right];
                    while (left < right && nums[left] == last_left) ++left;
                    while (left < right && nums[right] == last_right) --right;
                }
            }
        }
        return result;
        
    }
}
