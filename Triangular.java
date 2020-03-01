// Put standard "header" information here:
//   - Andrew MacKenzie && Ian McDuff
//   - COMP 1731
//   - Lab 3
//   - Jan 27 2020

import java.util.*;
public class Triangular{
	public static void main(String[] args){
        int n = 1;
        int total = 0;
        while(n == 1){
            System.out.println("Enter a number greater than 0.");
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            if (x <= 0){
                System.out.println("You didn't enter a positive integer. not cool bro :(");
            } else{
                n = 0;
                while(x != 0){
                    total += x;
                    x -= 1;
                }
            }
        }
        System.out.println("your number is " + total);
	}
}
