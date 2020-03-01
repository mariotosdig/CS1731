// COMP 1731 (Winter 2020)
// Assignment 1, Problem 3
// Liam Keliher

import becker.robots.*;

public class PrimeMover extends RobotSE
{
    //---------------------------------------------------------------
    public PrimeMover(City city, int str, int ave, Direction dir)
    {
        super(city, str, ave, dir);
    } // constructor PrimeMover(City,int,int,Direction)
    //---------------------------------------------------------------
    // New move(int) method that overrides move(int) inherited from RobotSE
    public void move(int n)
    {
        if (ExtraMath.isPrime(n))
        {
            super.move(n);
            turnLeft();
        } // if
    } // move(int)
    //---------------------------------------------------------------
} // class PrimeMover