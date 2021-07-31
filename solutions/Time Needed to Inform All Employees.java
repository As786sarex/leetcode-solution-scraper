class Solution {
    int gMax=0;
    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime
        ) {
        Map<Integer,List<Integer>> tree=new HashMap<>();
        for(int i=0;i<n;++i){
            int x=manager[i];
            if(!tree.containsKey(x))
                tree.put(x,new ArrayList<>());
            tree.get(x).add(i);
        }
        dfs(headID,tree,informTime,informTime[headID]);
        return gMax;
    }
    
    private void dfs(int id,Map<Integer,List<Integer>> tree,int[] time,int 
        current){
        if(current>gMax)
            gMax=current;
        if(tree.get(id)!=null){
            for(int i:tree.get(id)){
                dfs(i,tree,time,current+time[i]);
            }
        }
    }
}
