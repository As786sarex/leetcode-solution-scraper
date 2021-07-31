class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m=mat.length,n=mat[0].length,temp=(r*c);
        if((m*n)!=temp)
           return mat;
        int[][] res=new int[r][c];
        int x=0;
        for(int i=0;i<m;++i){
           for(int j=0;j<n;++j){
              res[x/c][x%c]=mat[i][j];
              ++x;
           }
        }
        return res;
        
    }
}
