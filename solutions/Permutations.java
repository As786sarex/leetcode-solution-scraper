class Solution {
    List<List<Integer>> result;
    public List<List<Integer>> permute(int[] nums) {
        result=new ArrayList<>();
        permutation(nums,0,nums.length);
        return result;
    }
    
    void permutation(int[] nums,int start,int end){
        if(start>=end){
            List<Integer> l=new ArrayList<>();
            for(int x:nums)
                l.add(x);
            result.add(l);
            return;
        }
        for(int i=start;i<end;i++){
            swap(nums,start,i);
            permutation(nums,start+1,end);
            swap(nums,start,i);
        }   
    }
    
    void swap(int[] nums,int x,int y){
        int temp=nums[x];
        nums[x]=nums[y];
        nums[y]=temp;
    }
}
