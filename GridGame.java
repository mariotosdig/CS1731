//   - Andrew MacKenzie
//   - COMP 1731
//   - Mini-Assignment B
//   - 4.7.2020

public class GridGame {
  public static final int FALL_OFF = -1;
  public static final int GOING_IN_CIRCLES = -2;
  private int rows;
  private int columns;
  private char[][] board;

  GridGame(int rows, int columns, char[][] in_board){
    super();

    char[][] new_board = new char[rows][columns];
    for(int i = 0; i < rows; i++){
      for (int j = 0; j < columns; j++){
        new_board[i][j] = in_board[i][j];
      }
    }

    this.rows = rows;
    this.columns = columns;
    this.board = new_board;
  }

  public int playGame(){
    boolean[][] visited = new boolean[rows][columns];
    int i = 0;
    int j = 0;
    int moves = 0;
    while (true){
      if (i == rows || i < 0 || j == columns || j < 0){
        return FALL_OFF;
      } else if (board[i][j] == 'T'){
        return moves;
      } else if (visited[i][j] == true){
        return GOING_IN_CIRCLES;
      }

      visited[i][j] = true;

      if (board[i][j] == 'N'){
        i--;
      } else if (board[i][j] == 'S'){
        i++;
      } else if (board[i][j] == 'E'){
        j++;
      } else if (board[i][j] == 'W'){
        j--;
      }

      moves++;
    }
  }
}
