// COMP 1731
// Assignment 1
// Andrew MacKenzie
// 02/11/2020

import becker.robots.*;
public class TestSpiderBot{
    public static void main(String[] args){
        City tokyo = new City(10, 15);
        SpiderBot peter = new SpiderBot(tokyo, 5, 0, Direction.EAST);
        new Wall(tokyo, 1, 1, Direction.NORTH);
        new Wall(tokyo, 1, 1, Direction.WEST);
        new Wall(tokyo, 1, 1, Direction.EAST);
        new Wall(tokyo, 2, 1, Direction.WEST);
        new Wall(tokyo, 2, 1, Direction.EAST);
        new Wall(tokyo, 3, 1, Direction.WEST);
        new Wall(tokyo, 3, 1, Direction.EAST);
        new Wall(tokyo, 4, 1, Direction.WEST);
        new Wall(tokyo, 4, 1, Direction.EAST);
        new Wall(tokyo, 5, 1, Direction.WEST);
        new Wall(tokyo, 5, 1, Direction.EAST);

        new Wall(tokyo, 1, 3, Direction.NORTH);
        new Wall(tokyo, 1, 3, Direction.WEST);
        new Wall(tokyo, 1, 3, Direction.EAST);
        new Wall(tokyo, 2, 3, Direction.WEST);
        new Wall(tokyo, 2, 3, Direction.EAST);
        new Wall(tokyo, 3, 3, Direction.WEST);
        new Wall(tokyo, 3, 3, Direction.EAST);
        new Wall(tokyo, 4, 3, Direction.WEST);
        new Wall(tokyo, 4, 3, Direction.EAST);
        new Wall(tokyo, 5, 3, Direction.WEST);
        new Wall(tokyo, 5, 3, Direction.EAST);

        new Wall(tokyo, 1, 5, Direction.NORTH);
        new Wall(tokyo, 1, 5, Direction.WEST);
        new Wall(tokyo, 1, 5, Direction.EAST);
        new Wall(tokyo, 2, 5, Direction.WEST);
        new Wall(tokyo, 2, 5, Direction.EAST);
        new Wall(tokyo, 3, 5, Direction.WEST);
        new Wall(tokyo, 3, 5, Direction.EAST);
        new Wall(tokyo, 4, 5, Direction.WEST);
        new Wall(tokyo, 4, 5, Direction.EAST);
        new Wall(tokyo, 5, 5, Direction.WEST);
        new Wall(tokyo, 5, 5, Direction.EAST);
        peter.crawlWalls();
    }
}
