//   - Andrew MacKenzie && Noah Leblanc
//   - COMP 1731
//   - Lab 5 part 1
//   - Feb 24th 2020

import becker.robots.*;

public class TestTurnBot{
    public static void main(String[] args){
        City gotham = new City(15, 20);
        TurnBot batman = new TurnBot(gotham, 1, 1, Direction.EAST);
        TurnBot robin = new TurnBot(gotham, 14, 1, Direction.SOUTH);
        TurnBot joker = new TurnBot(gotham, 14, 19, Direction.WEST);
        TurnBot penguin = new TurnBot(gotham, 1, 19, Direction.WEST);
        batman.faceNorthA();
        robin.faceNorthB();
        joker.faceNorthC();
        penguin.face(Direction.NORTH);
    }
}