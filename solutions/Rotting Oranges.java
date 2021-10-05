class Solution {
    int[][] dir={{1,0},{0,1},{-1,0},{0,-1}};
    public int orangesRotting(int[][] grid) {
        Deque<int[]> queue=new ArrayDeque<>();
        int m=grid.length,n=grid[0].length,fresh=0,min=0;
        for(int i=0;i<m;++i){
            for(int j=0;j<n;++j){
                if(grid[i][j]==2){
                    queue.add(new int[]{i,j,0});
                } else if(grid[i][j]==1){
                    ++fresh;
                }
            }
        }
        while(!queue.isEmpty()&&fresh>0){
            int[] current=queue.poll();
            for(int[] d:dir){
                int xi=current[0]+d[0];
                int yi=current[1]+d[1];
                if(xi<0||yi<0||xi>=m||yi>=n)
                    continue;
                if(grid[xi][yi]==1){
                    --fresh;
                    min=Integer.max(min,current[2]+1);
                    queue.add(new int[]{xi,yi,current[2]+1});
                    grid[xi][yi]=2;
                }
            }
        }
        return fresh>0?-1:min;
    }
}
class Solution {
    int[][] dir={{1,0},{0,1},{-1,0},{0,-1}};
    public int orangesRotting(int[][] grid) {
        Deque<int[]> queue=new ArrayDeque<>();
        int m=grid.length,n=grid[0].length,fresh=0,min=0;
        for(int i=0;i<m;++i){
            for(int j=0;j<n;++j){
                if(grid[i][j]==2){
                    queue.add(new int[]{i,j,0});
                } else if(grid[i][j]==1){
                    ++fresh;
                }
            }
        }
        while(!queue.isEmpty()&&fresh>0){
            int[] current=queue.poll();
            for(int[] d:dir){
                int xi=current[0]+d[0];
                int yi=current[1]+d[1];
                if(xi<0||yi<0||xi>=m||yi>=n)
                    continue;
                if(grid[xi][yi]==1){
                    --fresh;
                    min=Integer.max(min,current[2]+1);
                    queue.add(new int[]{xi,yi,current[2]+1});
                    grid[xi][yi]=2;
                }
            }
        }
        return fresh>0?-1:min;
    }
}
