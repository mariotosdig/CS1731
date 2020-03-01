import becker.robots.*;

public class FirstRobots
{
    public static void main(String[] args)
    {
        City paris = new City(10, 15);
        Wall w1 = new Wall(paris, 2, 5, Direction.EAST);
        Thing t1 = new Thing(paris, 2, 6);
        Robot rob = new Robot(paris, 2, 4, Direction.EAST);
        rob.move();
        rob.turnLeft();
        rob.turnLeft();
        rob.turnLeft();
        rob.move();
        rob.turnLeft();
        rob.move();
        rob.turnLeft();
        rob.move();
        rob.pickThing();
        rob.move();
        rob.move();
    }
}