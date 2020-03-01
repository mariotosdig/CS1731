//   - Andrew MacKenzie && Noah Leblanc
//   - COMP 1731
//   - Lab 5 part 1
//   - Feb 24th 2020

import becker.robots.*;

public class TurnBot extends RobotSE{

    public TurnBot(City city, int street, int ave, Direction dir){
        super(city, street, ave, dir);
    }

    public void faceNorthA(){
        if (isFacingEast()){
            turnLeft();
        } else if (isFacingSouth()) {
            turnLeft(2);
        } else if (isFacingWest()){
            turnLeft(3);
        }
    }

    public void faceNorthB(){
        while (!isFacingNorth()){
            turnLeft();
        }
    }

    public void faceNorthC(){
        if (isFacingEast()){
            turnLeft();
        } else if (isFacingSouth()) {
            turnLeft(2);
        } else if (isFacingWest()){
            turnRight();
        }
    }

    public void face(Direction dir){
        while (!getDirection().equals(dir)){
            turnLeft();
        } 
    }
}