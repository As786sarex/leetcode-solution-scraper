class Solution {
    public int[][] generateMatrix(int n) {
        int i = 0, j = 0, offset = 0,sum=0,iter=n*n;
        int[][] mat=new int[n][n];
        int xSize = mat.length - 1, ySize = n-1;
        boolean xup = false, yup = true, xdown = false, ydown = false;
        while (iter-->0) {
            sum++;
            if (yup) {
                mat[i][j]=sum;
                if (j == (ySize - offset)) {
                    xup = true;
                    yup = false;
                    i += 1;
                } else {
                    j++;
                }
            } else if (xup) {
                mat[i][j]=sum;
                if (i == (xSize - offset)) {
                    ydown = true;
                    xup = false;
                    j -= 1;
                } else {
                    i++;
                }
            } else if (ydown) {
                mat[i][j]=sum;
                if (j == offset) {
                    xdown = true;
                    ydown = false;
                    i -= 1;
                } else {
                    j--;
                }
            } else if (xdown) {
                mat[i][j]=sum;
                if (i == (offset + 1)) {
                    //System.out.println(offset+" "+"jjhkjhj");
                    offset += 1;
                    xdown = false;
                    yup = true;
                    j += 1;
                } else {
                    i--;
                }
            }
        }
        return mat;
    }
}
class Solution {
    public int[][] generateMatrix(int n) {
        int i = 0, j = 0, offset = 0,sum=0,iter=n*n;
        int[][] mat=new int[n][n];
        int xSize = mat.length - 1, ySize = n-1;
        boolean xup = false, yup = true, xdown = false, ydown = false;
        while (iter-->0) {
            sum++;
            if (yup) {
                mat[i][j]=sum;
                if (j == (ySize - offset)) {
                    xup = true;
                    yup = false;
                    i += 1;
                } else {
                    j++;
                }
            } else if (xup) {
                mat[i][j]=sum;
                if (i == (xSize - offset)) {
                    ydown = true;
                    xup = false;
                    j -= 1;
                } else {
                    i++;
                }
            } else if (ydown) {
                mat[i][j]=sum;
                if (j == offset) {
                    xdown = true;
                    ydown = false;
                    i -= 1;
                } else {
                    j--;
                }
            } else if (xdown) {
                mat[i][j]=sum;
                if (i == (offset + 1)) {
                    //System.out.println(offset+" "+"jjhkjhj");
                    offset += 1;
                    xdown = false;
                    yup = true;
                    j += 1;
                } else {
                    i--;
                }
            }
        }
        return mat;
    }
}
