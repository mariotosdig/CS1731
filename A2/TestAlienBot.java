//   - Andrew MacKenzie
//   - COMP 1731
//   - Assignment 3
//   - 3.14.2020
import becker.robots.*;
import java.util.*;

public class TestAlienBot {
    public static void main(String[] args) {
        System.out.println("enter a side length: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        City tokyo = new City(16, 30);
        AlienBot ally = new AlienBot(tokyo, 4, 4, Direction.EAST, (num * num));
        AlienBot joe = new AlienBot(tokyo, 4, 15, Direction.EAST, (num * num));
        ally.makeSquare(num);
        joe.makeCircle(num);
    }
}
