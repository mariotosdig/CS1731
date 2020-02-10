// COMP 1731
// Assignment 1
// Andrew MacKenzie
// 02/11/2020

import becker.robots.*;
public class TestRandomBot{
  public static void main(String[] args){
    City tokyo = new City(16, 16);
    RandomBot charlie = new RandomBot(tokyo, 8, 8, Direction.EAST);
    for (int i = 0; i < 100; i++){
      charlie.moveRandom();
    }
  }
}
