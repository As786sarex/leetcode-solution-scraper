class Solution {
    public int numIslands(char[][] grid) {
        boolean[][] visited=new boolean[grid.length][grid[0].length];
        int result=0;
        for(int i=0;i<grid.length;++i){
            for(int j=0;j<grid[0].length;++j){
                if(grid[i][j]=='0'){
                    grid[i][j]='v';
                    continue;
                }
                if(grid[i][j]!='v'&&grid[i][j]=='1'){
                    dfs(grid,i,j);
                    ++result;
                }
            }
        }
        return result;
    }
    private void dfs(char[][] grid,int i,int j){
        if(grid[i][j]=='v')
            return;
        if(grid[i][j]=='0'){
            grid[i][j]='v';
            return;
        }
        grid[i][j]='v';
        if(i>0)
            dfs(grid,i-1,j);
        if(j>0)
            dfs(grid,i,j-1);
        if(i<grid.length-1)
            dfs(grid,i+1,j);
        if(j<grid[0].length-1)
            dfs(grid,i,j+1);
        
    }
}
class Solution {
    public int numIslands(char[][] grid) {
        boolean[][] visited=new boolean[grid.length][grid[0].length];
        int result=0;
        for(int i=0;i<grid.length;++i){
            for(int j=0;j<grid[0].length;++j){
                if(grid[i][j]=='0'){
                    grid[i][j]='v';
                    continue;
                }
                if(grid[i][j]!='v'&&grid[i][j]=='1'){
                    dfs(grid,i,j);
                    ++result;
                }
            }
        }
        return result;
    }
    private void dfs(char[][] grid,int i,int j){
        if(grid[i][j]=='v')
            return;
        if(grid[i][j]=='0'){
            grid[i][j]='v';
            return;
        }
        grid[i][j]='v';
        if(i>0)
            dfs(grid,i-1,j);
        if(j>0)
            dfs(grid,i,j-1);
        if(i<grid.length-1)
            dfs(grid,i+1,j);
        if(j<grid[0].length-1)
            dfs(grid,i,j+1);
        
    }
}
