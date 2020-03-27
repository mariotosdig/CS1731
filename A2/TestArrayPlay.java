//   - Andrew MacKenzie
//   - COMP 1731
//   - Assignment 3
//   - 3.14.2020
import java.util.*;

public class TestArrayPlay {
    public static void main(String[] args) {
      int[] myArray = new int[5];
      ArrayPlay.fillRandom(myArray);
      ArrayPlay.printArray(myArray);
      ArrayPlay.sort(myArray);
      ArrayPlay.printArray(myArray);
    }
}
