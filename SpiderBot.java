// COMP 1731
// Assignment 1
// Andrew MacKenzie
// 02/11/2020

import becker.robots.*;
public class SpiderBot extends RobotSE{
    public SpiderBot(City city, int ave, int str, Direction dir){
      super(city, ave, str, dir);
    }
    public void crawlWalls(){
      crawlOneBuilding();
      crawlOneBuilding();
      crawlOneBuilding();
    }
    public void crawlOneBuilding(){
      turnLeft();
      move(5);
      turnRight();
      move(2);
      turnRight();
      move(5);
      turnLeft();

    }
}
