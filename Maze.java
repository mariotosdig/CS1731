//  This program will generate a maze for the robot to go through.
//  Chris Heo and Andrew MacKenzie
//  COMP 1731
//  Lab 2
//  January 20, 2020
import becker.robots.*;

public class Maze
{
    public static void main(String[]args)
    {
        City sackville = new City(10, 15);
        Wall w1 = new Wall(sackville, 2, 5, Direction.EAST);
        Wall w2 = new Wall(sackville, 2, 5, Direction.SOUTH);
        Wall w3 = new Wall(sackville, 2, 5, Direction.NORTH);
        Wall w4 = new Wall(sackville, 2, 4, Direction.SOUTH);
        Wall w5 = new Wall(sackville, 2, 4, Direction.NORTH);
        Wall w6 = new Wall(sackville, 2, 3, Direction.WEST);
        Wall w7 = new Wall(sackville, 2, 3, Direction.NORTH);
        Wall w8 = new Wall(sackville, 3, 3, Direction.EAST);
        Wall w9 = new Wall(sackville, 3, 3, Direction.WEST);
        Wall w10 = new Wall(sackville, 4, 3, Direction.WEST);
        Wall w11 = new Wall(sackville, 4, 3, Direction.SOUTH);
        Wall w12 = new Wall(sackville, 4, 4, Direction.SOUTH);
        Wall w13 = new Wall(sackville, 4, 4, Direction.NORTH);
        Wall w14 = new Wall(sackville, 4, 5, Direction.SOUTH);
        Wall W15 = new Wall(sackville, 4, 5, Direction.NORTH);
        Wall w16 = new Wall(sackville, 4, 6, Direction.SOUTH);
        Wall w17 = new Wall(sackville, 4, 6, Direction.NORTH);
        Wall w18 = new Wall(sackville, 4, 7, Direction.SOUTH);
        Wall w19 = new Wall(sackville, 4, 7, Direction.NORTH);
        Wall w20 = new Wall(sackville, 4, 8, Direction.NORTH);
        Wall w21 = new Wall(sackville, 4, 9, Direction.SOUTH);
        Wall w22 = new Wall(sackville, 4, 9, Direction.NORTH);
        Wall w23 = new Wall(sackville, 4, 10, Direction.EAST);
        Wall w24 = new Wall(sackville, 4, 10, Direction.SOUTH);
        Wall w25 = new Wall(sackville, 3, 10, Direction.EAST);
        Wall w26 = new Wall(sackville, 3, 10, Direction.WEST);
        Wall w27 = new Wall(sackville, 3, 10, Direction.NORTH);
        Wall w28 = new Wall(sackville, 5, 8, Direction.EAST);
        Wall w29 = new Wall(sackville, 5, 8, Direction.WEST);
        Wall w30 = new Wall(sackville, 6, 8, Direction.EAST);
        Wall w31 = new Wall(sackville, 6, 8, Direction.WEST);
        Wall w32 = new Wall(sackville, 7, 8, Direction.EAST);
        Wall w33 = new Wall(sackville, 7, 8, Direction.WEST);
        Wall w34 = new Wall(sackville, 8, 8, Direction.EAST);
        Wall w35 = new Wall(sackville, 8, 8, Direction.SOUTH);
        Wall w36 = new Wall(sackville, 8, 7, Direction.SOUTH);
        Wall w37 = new Wall(sackville, 8, 7, Direction.NORTH);
        Wall w38 = new Wall(sackville, 8, 6, Direction.SOUTH);
        Wall w39 = new Wall(sackville, 8, 6, Direction.NORTH);
        Wall w40 = new Wall(sackville, 8, 5, Direction.SOUTH);
        Wall w41 = new Wall(sackville, 8, 5, Direction.NORTH);
        Wall w42 = new Wall(sackville, 8, 4, Direction.SOUTH);
        Wall w43 = new Wall(sackville, 8, 4, Direction.NORTH);
        Wall w44 = new Wall(sackville, 8, 3, Direction.WEST);
        Wall w45 = new Wall(sackville, 8, 3, Direction.SOUTH);
        Wall w46 = new Wall(sackville, 8, 3, Direction.NORTH);
        Thing t1 = new Thing(sackville, 4, 3);
        Thing t2 = new Thing(sackville, 4, 6);
        Thing t3 = new Thing(sackville, 3, 10);
        Thing t4 = new Thing(sackville, 7, 8);
        Thing t5 = new Thing(sackville, 8, 3);
        Robot robot = new Robot(sackville, 2, 5, Direction.WEST);
        robot.move();
        robot.move();
        robot.turnLeft();
        robot.move();
        robot.move();
        robot.pickThing();
        robot.turnLeft();
        robot.move();
        robot.move();
        robot.move();
        robot.pickThing();
        robot.move();
        robot.move();
        robot.move();
        robot.move();
        robot.turnLeft();
        robot.move();
        robot.pickThing();
        robot.turnLeft();
        robot.turnLeft();
        robot.move();
        robot.turnLeft();
        robot.turnLeft();
        robot.turnLeft();
        robot.move();
        robot.move();
        robot.turnLeft();
        robot.move();
        robot.move();
        robot.move();
        robot.pickThing();
        robot.move();
        robot.turnLeft();
        robot.turnLeft();
        robot.turnLeft();
        robot.move();
        robot.move();
        robot.move();
        robot.move();
        robot.move();
        robot.pickThing();
        robot.turnLeft();
        robot.turnLeft();

    }
}