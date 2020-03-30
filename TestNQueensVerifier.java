//   - Andrew MacKenzie
//   - COMP 1731
//   - Mini-Assignment A
//   - 3.31.2020

import java.io.File;
import java.util.*;

public class TestNQueensVerifier {
    public static void main(String[] args) throws Exception {
        // reads the user input using a scanner object to get the file location
        Scanner sc_line = new Scanner(System.in);
        System.out.println("Please enter the full file path for the board configuration:  ");
        String file_location = sc_line.nextLine();

        // creates an object from the file and a scanner to read the file
        File config = new File(file_location);
        Scanner sc_file = new Scanner(config);

        // takes the size from the first line of the file
        int size = Integer.parseInt(sc_file.nextLine());

        // creates a 2d array from the rest of the contents of the file
        int count = 0;
        char[][] board = new char[size][size];
        while (sc_file.hasNextLine()){
          board[count] = sc_file.nextLine().toCharArray();
          count++;
        }

        // creates a NQueensVerifier object and calls the validity method, providing an appropriate message based on the results
        NQueensVerifier verifier = new NQueensVerifier(size, board);
        boolean validity = verifier.isValidSolution();
        if (validity == true){
          System.out.println("The board you have given is valid!");
        } else {
          System.out.println("The board you have given is invalid.");
        }
    }
}
