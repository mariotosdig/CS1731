//   - Andrew MacKenzie
//   - COMP 1731
//   - Mini-Assignment A
//   - 3.31.2020

public class NQueensVerifier{
  private static final char QUEEN = 'Q';
  private static final char BLANK = 'B';
  private int size;
  private char[][] board;

  // constucts the board object if the given arguments are valid
  NQueensVerifier(int size, char[][] board){
    super();
    if (size < 1){ //
      throw new IllegalArgumentException("Your board size is not a positive integer.");
    }
    if (!checkBoardBasics(size, board)){
      throw new IllegalArgumentException("Something is not right with your config file.");
    }
    this.size = size;
    this.board = board;
  }

  // checks basic things about the given board that should be always true
  private boolean checkBoardBasics(int size, char[][] board){
    if (board == null){ // checks that the board is not null
      return false;
    }

    if (board.length != size){ // checks that the board size is the same as the size given
      return false;
    }

    for (int i = 0; i < size; i++){ // checks for any null rows in the board
      if(board[i] == null){
        return false;
      }
    }

    for (int i = 0; i < size; i++){ // checks that each row is the same size as the given size
      if(board[i].length != size){ // in other words, checking that the board is a square
        return false;
      }
    }

    for (int row = 0; row < size; row++){ // checks that each character is either a queen or blank
      for (int pos = 0; pos < size; pos++){
        if ( !(board[row][pos] == QUEEN || board[row][pos] == BLANK) ){
          return false;
        }
      }
    }
    return true;
  }

  // checks that there is one queen in each row
  private boolean oneQueenPerRow(){
    for (int i = 0; i < size; i++){
      int count = 0;
      for (int j = 0; j < size; j++) {
        if (board[i][j] == QUEEN) {
          count++;
        }
      }
      if (count != 1) {
        return false;
      }
    }
    return true;
  }

  // checks that there is one queen in each column
  private boolean oneQueenPerColumn(){
    for (int i = 0; i < size; i++){
      int count = 0;
      for (int j = 0; j < size; j++) {
        if (board[j][i] == QUEEN) {
          count++;
        }
      }
      if (count != 1) {
        return false;
      }
    }
    return true;
  }

  // checks if any 2 queens are diagonal from each other
  private boolean noDiagonalAttacks(){
    int[][] xyz = new int[size][2]; // creates a new array to store co-ordinates of queens
    int count = 0;
    for (int i = 0; i < size; i++){ // nested loop that stores co-ordinates of queens
      for (int j = 0; j < size; j++) {
        int[] queen_location = new int[2];
        queen_location[0] = i;
        queen_location[1] = j;
        if (board[i][j] == QUEEN) {
          xyz[count] = queen_location;
          count++;
        }
      }
    }
    for (int i = 0; i < size; i++){ // nested loop that checks if any 2 queens are diagonal to each other
      for (int j = 0; j < size; j++){
        if (j == i){
          j++;
        } else if (Math.abs(xyz[i][0]-xyz[j][0]) == Math.abs(xyz[i][1]-xyz[j][1])){
          return false;
        }
      }
    }
    return true;
  }

  // checks that all necessary checks output to be true
  public boolean isValidSolution(){
    if ( oneQueenPerRow() && oneQueenPerColumn() && noDiagonalAttacks() ){
      return true;
    } else {
      return false;
    }
  }
}
