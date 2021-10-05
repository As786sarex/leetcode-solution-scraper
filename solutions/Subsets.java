class Solution {
    List<List<Integer>> subset;
    public List<List<Integer>> subsets(int[] nums) {
        subset=new ArrayList<>();
        subsetUtil(0,0,nums);
        return subset;
    }
    
    void subsetUtil(int bitmask,int current,int[] nums){
        if(current==nums.length){
            List<Integer> temp=new ArrayList<>();
            for(int i=nums.length-1;i>=0;--i){
                if((bitmask&(1<<i))!=0){
                    temp.add(nums[nums.length-1-i]);
                }
            }
            
            subset.add(temp);
        }
        else {
            subsetUtil(bitmask,current+1,nums); //for exclude current
            subsetUtil((bitmask|(1<<current)),current+1,nums); //for include 
                current
        }
    }
}
class Solution {
    List<List<Integer>> subset;
    public List<List<Integer>> subsets(int[] nums) {
        subset=new ArrayList<>();
        subsetUtil(0,0,nums);
        return subset;
    }
    
    void subsetUtil(int bitmask,int current,int[] nums){
        if(current==nums.length){
            List<Integer> temp=new ArrayList<>();
            for(int i=nums.length-1;i>=0;--i){
                if((bitmask&(1<<i))!=0){
                    temp.add(nums[nums.length-1-i]);
                }
            }
            
            subset.add(temp);
        }
        else {
            subsetUtil(bitmask,current+1,nums); //for exclude current
            subsetUtil((bitmask|(1<<current)),current+1,nums); //for include 
                current
        }
    }
}
