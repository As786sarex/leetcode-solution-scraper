class Solution {
    const int MAX=1e9;
public:
    int minPathSum(vector<vector<int>>& grid) {
        int n=grid.size();
        int m=grid[0].size();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int maxX=MAX;
                int maxY=MAX;
                if(i==0&&j==0){
                    continue;
                }
                if(i!=0){
                    maxX=grid[i-1][j];
                }
                
                if(j!=0){
                    maxY=grid[i][j-1];
                }
                grid[i][j]=min((grid[i][j]+maxX),(grid[i][j]+maxY));
            }
        }
        return grid[n-1][m-1];
    }
};
