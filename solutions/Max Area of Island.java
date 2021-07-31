class Solution {
    
    int[][] direction={{0,1},{1,0},{0,-1},{-1,0}};
    
    public int maxAreaOfIsland(int[][] grid) {
        int m=grid.length,n=grid[0].length;
        boolean[][] visited=new boolean[m][n];
        int maxArea=0;
        for(int i=0;i<m;++i){
            for(int j=0;j<n;++j){
                if(grid[i][j]==1&&!visited[i][j]){
                    maxArea=Integer.max(maxArea,dfs(grid,visited,i,j));
                }
            }
        }
        return maxArea;
    }
    
    private int dfs(int[][] grid,boolean[][] visited,int i,int j){
        if(i<0||i>=grid.length)
            return 0;
        if(j<0||j>=grid[0].length)
            return 0;
        int area=0;
        visited[i][j]=true;
        for(int[] d:direction){
            int xi=i+d[0];
            int yi=j+d[1];
            if(xi>=0&&xi<grid.length&&yi>=0&&yi<grid[0].length){
                if(grid[xi][yi]==1&&!visited[xi][yi])
                    area+=dfs(grid,visited,xi,yi);
            }
        }
        return area+1;
    }
}
