// COMP 1731 (Winter 2020)
// Assignment 1, Problem 2
// Liam Keliher

import becker.robots.*;

public class TestRandomBot
{
    //---------------------------------------------------------------
    public static void main(String[] args)
    {
        City timbuktu = new City(12, 12);
        RandomBot dazed = new RandomBot(timbuktu, 6, 6, Direction.NORTH);
        int i = 0;
        while (i < 500)
        {
            dazed.moveRandom();
            i++;
        } // while
    } // main(String[])
    //---------------------------------------------------------------
} // class TestRandomBot