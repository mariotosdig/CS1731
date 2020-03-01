//   - Andrew MacKenzie && Noah Leblanc
//   - COMP 1731
//   - Lab 5 part 2
//   - Feb 24th 2020

import becker.robots.*;

public class TestHomingBot{
    public static void main(String[] args){
        City ionia = new City(16, 20);
        HomingBot garen = new HomingBot(ionia, 8, 10, Direction.EAST);
        garen.moveTo(13,4);
        garen.moveTo(2,17);
    }
}