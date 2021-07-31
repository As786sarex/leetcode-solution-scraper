class Solution {
    int[][] directions={{0,1},{1,0},{0,-1},{-1,0}};
    List<List<Integer>> result;
    int x=0,y=0;
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        result=new ArrayList<>();
        int m=heights.length,n=heights[0].length;
        int[][] visited=new int[m][n];
        int flag=1;
        for(int i=0;i<m;++i){
            for(int j=0;j<n;++j){
                dfs(heights,visited,flag++,i,j);
                if(x>=1&&y>=1)
                    result.add(Arrays.asList(i,j));
                x=0;y=0;
            }
        }
        return result;
    }
    
    void dfs(int[][] heights,int[][] visited,int flag,int i,int j){
        if(x>=2)
            return;
        if(i<0||j<0){
            x=1;
            return;
        }
        if(i>=heights.length||j>=heights[0].length){
            y=1;
            return;
        }
        if(visited[i][j]==flag)
            return;
        visited[i][j]=flag;
        for(int[] d:directions){
            int xc=i+d[0],yc=j+d[1];
            boolean b=true;
            if(xc>=0&&yc>=0&&xc<heights.length&&yc<heights[0].length)
                b=heights[i][j]>=heights[xc][yc];
            if(b)
                dfs(heights,visited,flag,xc,yc);
        }
    }
}
