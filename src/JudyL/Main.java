package JudyL;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double random = Math.random();
        int num = (int) (random * 10);
        Scanner input = new Scanner(System.in);
        System.out.println("Guess my secret number between 0 and 9:");
        int guess = input.nextInt();
        while (!((guess == (num))))
        {
            System.out.println("Guess again:");
            guess = input.nextInt();
        }
        System.out.println("You got it! The number is: " +num);


	// write your code here
    }
}
