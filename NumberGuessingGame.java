import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int minRange = 1;
        int maxRange = 100;
        int maxAttempts = 7;
        int rounds = 0;
        int totalScore = 0;

        System.out.println("Welcome to the Number Guessing Game!");

        while (true) {
            rounds++;
            int randomNumber = random.nextInt(maxRange - minRange + 1) + minRange;
            int attempts = 0;

            System.out.println("\nRound " + rounds);
            System.out.println("I've picked a number between " + minRange + " and " + maxRange + ". Try to guess it.");

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                attempts++;

                if (userGuess < randomNumber) {
                    System.out.println("Try a higher number.");
                } else if (userGuess > randomNumber) {
                    System.out.println("Try a lower number.");
                } else {
                    System.out.println("Congratulations! You've guessed the number (" + randomNumber + ") in " + attempts + " attempts.");
                    totalScore += maxAttempts - attempts + 1;
                    break;
                }
            }

            if (attempts >= maxAttempts) {
                System.out.println("Round over. The number was " + randomNumber + ". You've used all your attempts.");
            }

            System.out.print("Do you want to play another round? (y/n): ");
            String playAgain = scanner.next().toLowerCase();

            if (!playAgain.equals("y")) {
                break;
            }
        }

        System.out.println("Game Over!");
        System.out.println("Rounds played: " + rounds);
        System.out.println("Total score: " + totalScore);

        scanner.close();
    }
}
