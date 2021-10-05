class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] in=new int[numCourses];
        ArrayList[] graph=new ArrayList[numCourses];
        for(int i=0;i<numCourses;++i){
            graph[i]=new ArrayList<Integer>();
        }
        for(int[] p:prerequisites){
            graph[p[1]].add(p[0]);
            ++in[p[0]];
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<numCourses;++i){
            if(in[i]==0)
                q.add(i);
        }
        
        int result=0;
        while(!q.isEmpty()){
            int temp=q.poll();
            ++result;
            for(Object element:graph[temp]){
                Integer i=(Integer)element;
                if(--in[i]==0)
                    q.add(i);
            }
        }
        if(result==numCourses)
            return true;
        return false;
        
    }
}
class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] in=new int[numCourses];
        ArrayList[] graph=new ArrayList[numCourses];
        for(int i=0;i<numCourses;++i){
            graph[i]=new ArrayList<Integer>();
        }
        for(int[] p:prerequisites){
            graph[p[1]].add(p[0]);
            ++in[p[0]];
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<numCourses;++i){
            if(in[i]==0)
                q.add(i);
        }
        
        int result=0;
        while(!q.isEmpty()){
            int temp=q.poll();
            ++result;
            for(Object element:graph[temp]){
                Integer i=(Integer)element;
                if(--in[i]==0)
                    q.add(i);
            }
        }
        if(result==numCourses)
            return true;
        return false;
        
    }
}
