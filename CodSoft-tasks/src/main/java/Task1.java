//NUMBER GAME

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int userChoice = 1;
        int min = 1;
        int max = 10;
        int guessCount = 0;
        Random random = new Random();
        int randomNum = random.nextInt(max - min + 1) + min;
        Scanner scanner = new Scanner(System.in);
        int userGuess = -1;

        // game menu
        do {
            System.out.println("""
                               Welcome to the Number Guessing Game!
                               Please select an option:
                               1. Start Game
                               2. Exit""");

            userChoice = scanner.nextInt();
            System.out.println("You Selected option " + userChoice);

            // game logic

            while (userChoice == 1 && userGuess != randomNum) {
                System.out.print("Enter your guess(1-10): ");
                userGuess = scanner.nextInt();
                System.out.println("Your guess is: " + userGuess);

                guessCount++;

                if (userGuess == randomNum) {
                    System.out.println("Congratulations! Your guess is correct.");
                } else if (userGuess < randomNum) {
                    System.out.println("Oops! Your guess is too low.");
                } else {
                    System.out.println("Oops! Your guess is too high.");
                }

                if (guessCount == 3 && userGuess != randomNum) {
                    System.out.println(
                            "You have reached the maximum number of guesses. The correct number was " + randomNum
                                    + ".");
                    break;
                }
            }
            // Option for Replaying
            if (userChoice == 1) {
                System.out.println("Game Over! Do you want to play again? 1. Yes 2. No");
            }

        } while (userChoice != 2 && scanner.nextInt() == 1);

        scanner.close();
    }
}     
