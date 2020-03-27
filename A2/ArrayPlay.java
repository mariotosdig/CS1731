//   - Andrew MacKenzie
//   - COMP 1731
//   - Assignment 2
//   - 3.14.2020
import java.util.*;

public class ArrayPlay{
  private static final int MAX = 1000;
  private ArrayPlay(){
    super();
  }

  public static void fillRandom(int[] arr){
    Random rand = new Random();

    for (int i=0; i < arr.length; i++){
      arr[i] = rand.nextInt(MAX);
    }
  }

  public static void printArray(int[] arr){
    System.out.print("[");
    for (int i=0; i < arr.length; i++){
      if (i == arr.length - 1){
        System.out.print(arr[i] + "]");
      } else {
        System.out.print(arr[i] + ", ");
      }
    }
    System.out.println("");
  }

  private static int findIndexOfSmallest(int[] arr, int start, int end){
    int indexOfSmallest = start;
    for (int i=start; i < end; i++){
      if (arr[i] < arr[indexOfSmallest]){
        indexOfSmallest = i;
      }
    }
    return indexOfSmallest;
  }

  public static void sort(int[] arr){
    int temp = arr[0];
    int indexOfSmallest = 0;
    for (int i=0; i < arr.length; i++){
      temp = arr[i];
      indexOfSmallest = findIndexOfSmallest(arr, i, arr.length);
      arr[i] = arr[indexOfSmallest];
      arr[indexOfSmallest] = temp;
    }
  }
}
