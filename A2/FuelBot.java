//   - Andrew MacKenzie
//   - COMP 1731
//   - Assignment 2
//   - 3.14.2020

import becker.robots.*;

public class FuelBot extends RobotRC{
    private int fuelLevel;

    public FuelBot(City city, int street, int ave, Direction dir, int initial_fuel){
        super(city, street, ave, dir);
        set_fuel(initial_fuel);
        setLabel(Integer.toString(fuelLevel));
    }

    public int get_fuel(){
      return this.fuelLevel;
    }

    public void set_fuel(int fuel){
      if (fuel < 0){
          fuel = 0;
      }
      this.fuelLevel = fuel;
    }

    public void move(){
      if (fuelLevel >= 2){
        set_fuel(fuelLevel - 2);
        setLabel(Integer.toString(fuelLevel));
        super.move();
      } else {
        breakRobot("you were out of fuel :(");
      }

    }
}
