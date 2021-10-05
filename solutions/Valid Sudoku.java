class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character> rowSet=new HashSet<>();
        Set<Character> colSet=new HashSet<>();
        Set<Character> boxSet=new HashSet<>();
        
        for(int i=0;i<9;++i){
            for(int j=0;j<9;++j){
                char row=board[i][j];
                char col=board[j][i];
                char box=board[((i/3)*3)+(j/3)][((i%3)*3)+(j%3)];
                if(validate(row,col,box,rowSet,colSet,boxSet))
                    return false;
            }
            rowSet.clear();
            colSet.clear();
            boxSet.clear();
        }
        return true;
    }
    
    private boolean validate(char row,char col,char box,Set<Character> rowSet
        ,Set<Character> colSet,Set<Character> boxSet) {
        if(row!='.'){
            if(rowSet.contains(row))
                return true;
            rowSet.add(row);
        }
        if(col!='.'){
            if(colSet.contains(col))
                return true;
            colSet.add(col);
        }
        if(box!='.'){
            if(boxSet.contains(box))
                return true;
            boxSet.add(box);
        }
        return false;
    }
}
