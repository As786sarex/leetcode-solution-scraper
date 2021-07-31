class Solution {
    public void gameOfLife(int[][] board) {
        for(int i=0;i<board.length;++i){
            for(int j=0;j<board[0].length;++j){
                int c=0,curr=board[i][j];
                c+=getCell(board,i-1,j-1);
                c+=getCell(board,i-1,j);
                c+=getCell(board,i-1,j+1);
                c+=getCell(board,i,j-1);
                c+=getCell(board,i,j+1);
                c+=getCell(board,i+1,j-1);
                c+=getCell(board,i+1,j);
                c+=getCell(board,i+1,j+1);
                if(curr==1&&(c<2||c>3))
                    board[i][j]=3;
                else if(curr==0&&c==3)
                    board[i][j]=2;
            }
        }
        
        for(int i=0;i<board.length;++i){
            for(int j=0;j<board[0].length;++j){
                if(board[i][j]==2)
                    board[i][j]=1;
                else if(board[i][j]==3)
                    board[i][j]=0;
            }
        }
        
    }
    
    private int getCell(int[][] board,int x,int y){
        if(x>=board.length||x<0||y>=board[0].length||y<0)
            return 0;
        if(board[x][y]==1||board[x][y]==3)
            return 1;
        return 0;
    }
}
