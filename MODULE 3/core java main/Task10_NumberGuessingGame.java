import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random rand = new Random();
        int numberToGuess = rand.nextInt(100) + 1;
        int guess = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess a number between 1 and 100:");

        while (guess != numberToGuess) {
            guess = sc.nextInt();
            if (guess < numberToGuess) {
                System.out.println("Too low!");
            } else if (guess > numberToGuess) {
                System.out.println("Too high!");
            } else {
                System.out.println("Correct! The number was " + numberToGuess);
            }
        }
    }
}