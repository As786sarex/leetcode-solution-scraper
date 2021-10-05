class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int m=mat.length,n=mat[0].length,mx=(int)1e5;
        for(int i=0;i<m;++i){
            for(int j=0;j<n;++j){
                if(mat[i][j]==0)
                    continue;
                int mn=mx;
                if(i>0){
                    mn=mat[i-1][j]+1;
                }
                if(j>0)
                    mn=Integer.min(mn,mat[i][j-1]+1);
                mat[i][j]=mn;
            }
        }
        for(int i=m-1;i>=0;--i){
            for(int j=n-1;j>=0;--j){
                if(mat[i][j]==0)
                    continue;
                int mn=mx;
                if(i<m-1){
                    mn=mat[i+1][j]+1;
                }
                if(j<n-1)
                    mn=Integer.min(mn,mat[i][j+1]+1);
                mat[i][j]=Integer.min(mat[i][j],mn);
            }
        }
        return mat;
    }
}
class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int m=mat.length,n=mat[0].length,mx=(int)1e5;
        for(int i=0;i<m;++i){
            for(int j=0;j<n;++j){
                if(mat[i][j]==0)
                    continue;
                int mn=mx;
                if(i>0){
                    mn=mat[i-1][j]+1;
                }
                if(j>0)
                    mn=Integer.min(mn,mat[i][j-1]+1);
                mat[i][j]=mn;
            }
        }
        for(int i=m-1;i>=0;--i){
            for(int j=n-1;j>=0;--j){
                if(mat[i][j]==0)
                    continue;
                int mn=mx;
                if(i<m-1){
                    mn=mat[i+1][j]+1;
                }
                if(j<n-1)
                    mn=Integer.min(mn,mat[i][j+1]+1);
                mat[i][j]=Integer.min(mat[i][j],mn);
            }
        }
        return mat;
    }
}
