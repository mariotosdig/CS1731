// COMP 1731 (Winter 2020)
// Assignment 1, Problem 2
// Liam Keliher

import becker.robots.*;
import java.util.*;

public class RandomBot extends RobotSE
{
    //---------------------------------------------------------------
    public RandomBot(City city, int street, int ave, Direction dir)
    {
        super(city, street, ave, dir);
    } // constructor RandomBot(City,int,int,Direction)
    //---------------------------------------------------------------
    // Method that makes the RandomBot move randomly by generating
    // a random integer between 0 and 3 (inclusive), and then giving
    // move and/or turn instructions that depend on this integer
    public void moveRandom()
    {
        Random rand = new Random();
        int num = rand.nextInt(4);
        if (num == 0)
        {
            move(2);
        } // if
        else if (num == 1)
        {
            turnLeft();
            move();
        } // else if
        else if (num == 2)
        {
            turnRight();
            move();
        } // else if
        else if (num == 3)
        {
            turnAround();
            move(2);
        } // else
    } // moveRandom()
    //---------------------------------------------------------------
} // class RandomBot