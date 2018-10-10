package JudyL;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double num = Math.random();
        num = Math.round(num * 10);
        Scanner guess = new Scanner(System.in);
        System.out.println("Guess my secret number:");
        while (!(guess.nextLine().equals(num)))
        {
            System.out.println("Guess again:");
        }
        System.out.println("You got it! The number is: " +num);


	// write your code here
    }
}
