class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=matrix.length-1,column=matrix[0].length-1;
        while(row>=0){
            if(matrix[row][column]==target)
                return true;
            else if(matrix[row][column]>target)
                --row;
            else
                break;
        }
        if(row!=(matrix.length-1))
            ++row;
        while(--column>=0){
            if(matrix[row][column]==target)
                return true;
            else if(matrix[row][column]<target)
                return false;
        }
        return false;
    }
}
