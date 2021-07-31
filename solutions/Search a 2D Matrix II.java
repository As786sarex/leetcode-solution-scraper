class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int x=0,y=matrix[0].length-1;
        while(true){
            if(x>=matrix.length||y<0)
                return false;
            if(matrix[x][y]==target)
                return true;
            else if(matrix[x][y]<target)
                ++x;
            else
                --y;
        }
    }
}
