//   - Andrew MacKenzie && Noah Leblanc
//   - COMP 1731
//   - Lab 5 part 3
//   - Feb 24th 2020
import java.util.*;

public class TestQuizMaster{
    public static void main(String[] args){
        boolean correct = false;
        QuizMaster quiz = new QuizMaster();
        while (!correct){
            System.out.println("please guess a number between 1 and 100 (inclusive)");
            Scanner sc = new Scanner(System.in);
            int guess = sc.nextInt();
            System.out.println(quiz.respond(guess));
            if (quiz.respond(guess).equals("you win")){
                correct = true;
            }
        }
    }
}