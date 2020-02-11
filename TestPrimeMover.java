// COMP 1731
// Assignment 1
// Andrew MacKenzie
// 02/11/2020

import becker.robots.*;
public class TestPrimeMover{
  public static void main(String[] args){
    City tokyo = new City(16, 16);
    PrimeMover david = new PrimeMover(tokyo, 8, 8, Direction.EAST);
    david.move(0);
    david.turnLeft();
    david.move(1);
    david.turnLeft();
    david.move(2);
    david.turnLeft();
    david.move(3);
    david.turnLeft();
    david.move(4);
    david.turnLeft();
    david.move(5);
    david.turnLeft();
    david.move(6);
    david.turnLeft();
    david.move(13);
    david.turnLeft();
    david.move(15);
    david.turnLeft();
    david.move(64);
    david.turnLeft();
    david.move(71);
    david.turnLeft();
    david.move(128);
    david.turnLeft();
    david.move(131);
    david.turnLeft();
  }
}
