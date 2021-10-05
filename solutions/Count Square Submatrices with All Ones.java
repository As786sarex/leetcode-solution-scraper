class Solution {
    public int countSquares(int[][] matrix) {
        for(int i=1;i<matrix.length;i++){
            for(int j=1;j<matrix[0].length;j++){
                if(matrix[i][j]==1){
                    matrix[i][j]=mini(matrix[i-1][j],matrix[i][j-1],matrix[i
                        -1][j-1])+1;
                }
            }
        }
        int count=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                count+=matrix[i][j];
            }
        }
        return count;
    }
    int mini(int a,int b,int c){
        return Integer.min(a,Integer.min(b,c));
    }
}
class Solution {
    public int countSquares(int[][] matrix) {
        for(int i=1;i<matrix.length;i++){
            for(int j=1;j<matrix[0].length;j++){
                if(matrix[i][j]==1){
                    matrix[i][j]=mini(matrix[i-1][j],matrix[i][j-1],matrix[i
                        -1][j-1])+1;
                }
            }
        }
        int count=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                count+=matrix[i][j];
            }
        }
        return count;
    }
    int mini(int a,int b,int c){
        return Integer.min(a,Integer.min(b,c));
    }
}
