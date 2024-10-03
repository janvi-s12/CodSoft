import java.util.Scanner;
import java.util.Random;

public class GuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int score = 0;

        System.out.println("Welcome to the Number Guessing Game!");

        // Game loop for multiple rounds
        while (true) {
            int numberToGuess = random.nextInt(100) + 1; // Random number between 1 and 100
            System.out.println("\nGuess the number between 1 and 100 (You have 5 attempts):");

            // Using a for loop for attempts
            for (int attempts = 5; attempts > 0; attempts--) {
                System.out.print("Enter your guess: ");
                if (scanner.nextInt() == numberToGuess) {
                    System.out.println("Correct! You win this round.");
                    score++;
                    break; // Exit the loop when guessed correctly
                }
                System.out.println("Wrong! " + (attempts - 1 > 0 ? "Try again." : "No attempts left."));
            }

            System.out.println("The correct number was: " + numberToGuess);
            System.out.print("Play again? (yes/no): ");
            if (!scanner.next().equalsIgnoreCase("yes")) {
                break;
            }
        }

        System.out.println("Game over! Your score: " + score);
        scanner.close();
    }
}
