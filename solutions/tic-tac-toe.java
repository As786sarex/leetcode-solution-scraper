public class TicTacToe {
  private int[] rows;
  private int[] cols;
  private int diag, anti_diag;
  private int size;

  /** Initialize your data structure here. */
  public TicTacToe(int n) {
      rows = new int[n];
      cols = new int[n];
      size=n;
  }
  
  public int move(int row, int col, int player) {
        if(player == 1){
            rows[row]++; cols[col]++;
            if(row == col) diag++;
            if(row + col == size - 1) anti_diag++;
            if(rows[row] == size || cols[col] == size || diag == size || anti_diag == size) return 1;
        }
        else { //player 2
            rows[row] --; cols[col]--;
            if(row == col) diag--;
            if(row + col == size - 1) anti_diag--;
            if(rows[row] == -size || cols[col] == -size || diag == -size || anti_diag == -size) return 2;
        }

        return 0;
    }
}
