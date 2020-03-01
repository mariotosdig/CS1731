// COMP 1731 (Winter 2020)
// Assignment 1, Problem 1
// Liam Keliher

import becker.robots.*;

public class SpiderBot extends RobotSE
{
    //---------------------------------------------------------------
    public SpiderBot(City city, int street, int ave, Direction dir)
    {
        super(city, street, ave, dir);
    } // constructor SpiderBot(City,int,int,Direction)
    //---------------------------------------------------------------
    // Causes the SpiderBot to crawl over 3 buildings as specified
    public void crawlWalls()
    {
        crawlOneBuilding();
        crawlOneBuilding();
        crawlOneBuilding();
    } // crawlWalls()
    //---------------------------------------------------------------
    // Helper method for crawlWalls that makes the SpiderBot crawl
    // over one building, finishing ready to crawl over the next
    public void crawlOneBuilding()
    {
        turnLeft();
        move(5);
        turnRight();
        move(2);
        turnRight();
        move(5);
        turnLeft();
    } // crawlOneBuiding()
    //---------------------------------------------------------------
} // class SpiderBot