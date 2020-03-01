// COMP 1731 (Winter 2020)
// Assignment 1, Problem 1
// Liam Keliher

import becker.robots.*;

public class TestSpiderBot
{
    //---------------------------------------------------------------
    public static void main(String[] args)
    {
        City phoenix = new City(10, 15);
        new Wall(phoenix, 5, 1, Direction.WEST);
        new Wall(phoenix, 5, 1, Direction.EAST);
        new Wall(phoenix, 4, 1, Direction.WEST);
        new Wall(phoenix, 4, 1, Direction.EAST);
        new Wall(phoenix, 3, 1, Direction.WEST);
        new Wall(phoenix, 3, 1, Direction.EAST);
        new Wall(phoenix, 2, 1, Direction.WEST);
        new Wall(phoenix, 2, 1, Direction.EAST);
        new Wall(phoenix, 1, 1, Direction.WEST);
        new Wall(phoenix, 1, 1, Direction.EAST);
        new Wall(phoenix, 1, 1, Direction.NORTH);

        new Wall(phoenix, 5, 3, Direction.WEST);
        new Wall(phoenix, 5, 3, Direction.EAST);
        new Wall(phoenix, 4, 3, Direction.WEST);
        new Wall(phoenix, 4, 3, Direction.EAST);
        new Wall(phoenix, 3, 3, Direction.WEST);
        new Wall(phoenix, 3, 3, Direction.EAST);
        new Wall(phoenix, 2, 3, Direction.WEST);
        new Wall(phoenix, 2, 3, Direction.EAST);
        new Wall(phoenix, 1, 3, Direction.WEST);
        new Wall(phoenix, 1, 3, Direction.EAST);
        new Wall(phoenix, 1, 3, Direction.NORTH);
        
        new Wall(phoenix, 5, 5, Direction.WEST);
        new Wall(phoenix, 5, 5, Direction.EAST);
        new Wall(phoenix, 4, 5, Direction.WEST);
        new Wall(phoenix, 4, 5, Direction.EAST);
        new Wall(phoenix, 3, 5, Direction.WEST);
        new Wall(phoenix, 3, 5, Direction.EAST);
        new Wall(phoenix, 2, 5, Direction.WEST);
        new Wall(phoenix, 2, 5, Direction.EAST);
        new Wall(phoenix, 1, 5, Direction.WEST);
        new Wall(phoenix, 1, 5, Direction.EAST);
        new Wall(phoenix, 1, 5, Direction.NORTH);
        
        SpiderBot peter = new SpiderBot(phoenix, 5, 0, Direction.EAST);
        peter.crawlWalls();
    } // main(String[])
    //---------------------------------------------------------------
} // class TestSpiderBot