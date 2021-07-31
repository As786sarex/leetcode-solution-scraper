class Solution {
    List<List<Integer>> result=new ArrayList<>();
    LinkedList<Integer> list;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        list=new LinkedList<>();
        comSum(candidates,target,0);
        return result;
    }
    
    private void comSum(int[] candidates,int target,int current){
        if(target==0){
            result.add(new ArrayList<Integer>(list));
            return;
        }
        for(int i=current;i<candidates.length;++i){
                if((i>current)&&(candidates[i]==candidates[i-1])) 
                    continue;
                if ((target - candidates[i]) < 0)
                    break;
                list.addLast(candidates[i]);
                comSum(candidates,target-candidates[i],i+1);
                list.removeLast();
            }
    }
}
