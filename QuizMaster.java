//   - Andrew MacKenzie && Noah Leblanc
//   - COMP 1731
//   - Lab 5 part 3
//   - Feb 24th 2020
import java.util.*;

public class QuizMaster{
    private int secretNum;
    public static final int DEFAULT_SECRET = 50;
    public QuizMaster(){
        Random rand = new Random();
        secretNum = rand.nextInt(100) + 1;
    }

    public QuizMaster(int number){
        if (1 <= number && number <= 100){
            secretNum = number;
        } else {
            secretNum = DEFAULT_SECRET;
        }
    }

    public String respond(int guess){
        if (guess < secretNum){
            return "too low";
        } else if (guess > secretNum){
            return "too high";
        } else{
            return "you win";
        }
    }
}
