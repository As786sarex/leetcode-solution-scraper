class Solution {
    
    Map<Integer,ArrayList<Integer>> graph;
    int[] in;
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        createGraph(numCourses,prerequisites);
        return findOrder();
    }
    
    private void createGraph(int num, int[][] p){
        graph=new HashMap<>();
        in=new int[num];
        for(int i=0;i<num;++i){
            graph.put(i,new ArrayList<>());
        }
        
        for(int[] dep:p){
            graph.get(dep[1]).add(dep[0]);
            in[dep[0]]++;
        }
    }
    
    private int[] findOrder(){
        int[] res=new int[in.length];
        int sz=0;
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<in.length;++i)
            if(in[i]==0)
                q.add(i);
        while(!q.isEmpty()){
            int element=q.poll();
            res[sz++]=element;
            for(int x:graph.get(element)){
                in[x]--;
                if(in[x]==0)
                    q.add(x);
            }
        }
        
        if(sz<in.length)
            return new int[]{};
        return res;
        
    }
}
