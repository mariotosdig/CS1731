//   - Andrew MacKenzie
//   - COMP 1731
//   - Assignment 2
//   - 3.14.2020
import java.lang.*;
import becker.robots.*;

public class AlienBot extends RobotSE {

    public AlienBot(City city, int street, int ave, Direction dir, int things) {
        super(city, street, ave, dir, things);
    }

    public void oneRow(int num) {
        for (int i = 0; i < num; i++) {
            putThing();
            move();
        }
        turnLeft();
        turnLeft();
        move(num);
        turnLeft();
        move();
        turnLeft();

    }
    public void oneRow(int num, int center_street, int center_avenue) {
        int r = (num - 1) / 2;
        for (int i = 0; i < num; i++) {
            int current_street = getStreet();
            int current_avenue = getAvenue();
            int distance = (int) Math.sqrt((double)(current_street - center_street) * (double)(current_street - center_street) + (double)(current_avenue - center_avenue) * (double)(current_avenue - center_avenue));
            System.out.println(distance);
            if (distance <= r) {
                putThing();
                move();
            } else {
                move();
            }
        }
        turnLeft();
        turnLeft();
        move(num);
        turnLeft();
        move();
        turnLeft();
    }


    public void makeSquare(int num) {
        while (!isFacingEast()) {
            turnLeft();
        }
        if (num <= 0) {
            return;
        }
        for (int i = 0; i < num; i++) {
            oneRow(num);
        }
    }

    public void makeCircle(int num) {
        int center_street = getStreet() + (num - 1) / 2;
        int center_avenue = getAvenue() + (num - 1) / 2;
        boolean even = false;
        if (num % 2 < 1) {
            even = true;
        }

        while (!isFacingEast()) {
            turnLeft();
        }
        if (num <= 0 || even) {
            return;
        }
        for (int i = 0; i < num; i++) {
            oneRow(num, center_street, center_avenue);
        }
    }
}
