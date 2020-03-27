//   - Andrew MacKenzie
//   - COMP 1731
//   - Assignment 3
//   - 3.14.2020
import becker.robots.*;
import java.util.*;

public class TestFuelBot {
    public static void main(String[] args) {
        System.out.println("enter an inital fuel level: ");
        Scanner sc = new Scanner(System.in);
        int init_fuel = sc.nextInt();
        City tokyo = new City(16, 30);
        FuelBot frank = new FuelBot(tokyo, 4, 4, Direction.EAST, init_fuel);
    }
}
