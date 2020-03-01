//   - Andrew MacKenzie && Noah Leblanc
//   - COMP 1731
//   - Lab 5 part 2
//   - Feb 24th 2020

import becker.robots.*;

public class HomingBot extends RobotSE{

    public HomingBot(City city, int street, int ave, Direction dir){
        super(city, street, ave, dir);
    }

    public void moveTo(int street, int ave){
        while (!getDirection().equals(Direction.EAST)){
            turnLeft();
        } 
        if (getAvenue() > ave){
            turnAround();
            while (getAvenue() != ave){
                move();
            }
            if (getStreet() > street){
                turnRight();
                while (getStreet() != street){
                    move();
                }
            } else {
                turnLeft();
                while (getStreet() != street){
                    move();
                }
            }
        } else {
            while (getAvenue() != ave){
                move();
            }
            if (getStreet() > street){
                turnLeft();
                while (getStreet() != street){
                    move();
                }
            } else {
                turnRight();
                while (getStreet() != street){
                    move();
                }
            }
        }
    }
}