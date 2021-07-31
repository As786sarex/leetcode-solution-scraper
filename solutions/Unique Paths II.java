class Solution {
    public int uniquePathsWithObstacles(int[][] grid){
        for(int i=0;i<grid[0].length;++i){
            if(grid[0][i]==1)
                grid[0][i]=0;
            else if(i==0)
                grid[0][i]=1;
            else
                grid[0][i]=grid[0][i-1];
        }
        
        for(int i=0;i<grid.length;++i){
            if(i==0)
                continue;
            else if(grid[i][0]==1)
                grid[i][0]=0;
            else
                grid[i][0]=grid[i-1][0];
        }
        
        for(int i=1;i<grid.length;++i){
            for(int j=1;j<grid[0].length;++j){
                if(grid[i][j]==1)
                    grid[i][j]=0;
                else
                    grid[i][j]=grid[i-1][j]+grid[i][j-1];
            }
        }
        
        
        return grid[grid.length-1][grid[0].length-1];
    }
}
