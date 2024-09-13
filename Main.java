import java.util.Random;
import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        Random rand=new Random();
        int x= rand.nextInt(100);

        Scanner scan = new Scanner(System.in);
        int guess;
        int count=0;

        do{
            System.out.println("Enter your guess:");
            guess=scan.nextInt();

            if (guess>x){
                System.out.print("too high");
                count++;
            }

            if (guess<x){
                System.out.print("too low ");
                count++;
            }

        } while (guess!=x);
        if (count<=7){
            System.out.print("You got an impossibly good score");
        }

        if (count<=10 & count>=8){
            System.out.print("You did a good job!");
        }

        if (count>10){
            System.out.print("Try the divide and conquer strategy next Time!");
        }



            //if guess is less than x
            //if guess is more than x
            //count how many guesses
            //if count is less than 7, you print a very good response
            //exit condition - guess=x
           

        System.out.print(guess);

    }
}
