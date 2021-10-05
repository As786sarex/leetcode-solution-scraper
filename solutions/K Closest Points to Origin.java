class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> q=new PriorityQueue<>((a,b)->b[1]-a[1]);
        for(int i=0;i<points.length;++i){
            int[] p=points[i];
            q.add(new int[]{i,((p[0]*p[0])+(p[1]*p[1]))});
            if(q.size()>k)
                q.poll();
        }
        int[][] result=new int[k][2];
        int x=0;
        while(!q.isEmpty())
            result[x++]=points[(q.poll()[0])];
        
        return result;
    }
}
