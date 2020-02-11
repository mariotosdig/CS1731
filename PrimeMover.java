// COMP 1731
// Assignment 1
// Andrew MacKenzie
// 02/11/2020

import becker.robots.*;
public class PrimeMover extends RobotSE{
  public PrimeMover(City city, int ave, int str, Direction dir){
    super(city, ave, str, dir);
  }
  public void move(int n){
    if(ExtraMath.isPrime(n)){
      super.move(n);
      System.out.println("Moving " + n + " times.");
    }
  }
}
