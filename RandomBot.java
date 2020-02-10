// COMP 1731
// Assignment 1
// Andrew MacKenzie
// 02/11/2020

import java.util.*;
import becker.robots.*;
public class RandomBot extends RobotSE{
  public RandomBot(City city, int ave, int str, Direction dir){
    super(city, ave, str, dir);
    }
  public void moveRandom(){
    Random randomObject = new Random();
    int number = randomObject.nextInt(4);
    if(number == 0){
      move(2);
    } else if(number == 1){
      turnLeft();
      move();
    } else if(number == 2){
      turnRight();
      move();
    } else if(number == 3){
      turnAround();
      move(2);
    }
  }
}
