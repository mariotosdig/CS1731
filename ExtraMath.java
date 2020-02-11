// COMP 1731
// Assignment 1
// Andrew MacKenzie
// 02/11/2020

public class ExtraMath{
  public static boolean isPrime(int n){
    if (n < 2){
      return false;
    }
    for (int i = 2; i < n-1; i++){
      if(n % i == 0){
        return false;
      }
    }
    return true;
  }
}
