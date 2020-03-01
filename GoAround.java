// Put standard "header" information here:
//   - Andrew MacKenzie && Ian McDuff
//   - COMP 1731
//   - Lab 3
//   - Jan 27 2020

import becker.robots.*;
public class GoAround{
	public static void main(String[] args){

		City atlantis = new City("layout.txt");
    	Robot stacys_mom = new Robot(atlantis, 1, 2, Direction.SOUTH);
		int x = 1;
		while(x == 1){
			while (stacys_mom.canPickThing() == false && stacys_mom.frontIsClear()){
			stacys_mom.move();
			}
			if (stacys_mom.canPickThing()){
				stacys_mom.pickThing();
				x = 0;
			}
			else {
				stacys_mom.turnLeft();
			}
		}
	}
}
