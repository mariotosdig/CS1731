// COMP 1731 (Winter 2020)
// Assignment 1, Problem 3
// Liam Keliher

import becker.robots.*;

public class TestPrimeMover
{
    //---------------------------------------------------------------
    public static void main(String[] args)
    {
        City athens = new City(11, 13);
        PrimeMover euclid = new PrimeMover(athens, 7, 5, Direction.EAST);
        euclid.move(2);
        euclid.move(4);
        euclid.move(5);
        euclid.move(6);
        euclid.move(7);
        euclid.move(-1);
    } // main(String[])
    //---------------------------------------------------------------
} // class TestPrimeMover