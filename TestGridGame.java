//   - Andrew MacKenzie
//   - COMP 1731
//   - Mini-Assignment B
//   - 4.7.2020

import java.io.*;
import java.util.*;

public class TestGridGame {
    public static void main(String[] args){

      Scanner sc_line = new Scanner(System.in);
      System.out.println("Please enter the full file path for the board configuration:  ");
      String file_location = sc_line.nextLine();
      sc_line.close();

      try {
        File config = new File(file_location);
        Scanner sc_file = new Scanner(config);

        int rows = sc_file.nextInt();
        int columns = sc_file.nextInt();

        int count = 0;
        char[][] board = new char[rows][columns];
        sc_file.nextLine();
        while (sc_file.hasNextLine()){
          board[count] = sc_file.nextLine().toCharArray();
          count++;
        }

        System.out.println(Arrays.deepToString(board).replace("], ", "]\n"));

        GridGame game = new GridGame(rows, columns, board);
        int moves = game.playGame();
        if (moves == GridGame.FALL_OFF){
          System.out.println("I fell off the board!");
        } else if (moves == GridGame.GOING_IN_CIRCLES){
          System.out.println("I'm really lost :(");
        } else {
          System.out.println("I reached the treasure in " + moves + " turns.");
        }

      } catch (FileNotFoundException e) {
        System.out.println("File not found. Have you checked your spelling?");
      }

    }
}
