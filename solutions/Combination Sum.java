class Solution {
    public List<List<Integer>> combinationSum(int[] can, int target){
        List<List<Integer>> res=new LinkedList<>();
        Deque<Integer> stack= new ArrayDeque<>();
        combination(can,target,0,res,stack);
        return res;
    }

    private void combination(int[] nums,int target,int index,List<List<Integer
        >> res,Deque<Integer> stack){
        if(target<0)
           return;
        if(target==0){
            res.add(new LinkedList<>(stack));
            return;
        }
        for(int i=index;i<nums.length;++i){
            stack.add(nums[i]);
            combination(nums,target-nums[i],i,res,stack);
            stack.pollLast();
        }
    }
}
