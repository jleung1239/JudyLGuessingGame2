package JudyL;

import java.util.Scanner;

public class JudyLLib {

    public static void GuessGame1(int run) {
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
    }

    public static void GuessGame2(int run) {
        int max = 100;
        int min = 0;
        int guess = 50
        System.out.println("Think of a integer between 0 and 100 and I'll try to guess it.");
        Scanner input = new Scanner(System.in);
        System.out.println("Is your integer 50?");
        String answer = input.nextLine();
        while (!(answer.equals("correct")) || !(answer.equals("Correct")))
        {
            if ((answer.equals("too high")) || (answer.equals("Too high")))
            {

            }
        }
        System.out.println("")
    }
}
