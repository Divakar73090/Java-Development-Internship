import java.util.Random;
import java.util.Scanner;

public class NumberGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int score = 0;
        char playAgain;

        do {
            // Generate random number between 1 and 100
            int number = random.nextInt(100) + 1;

            int attempts = 0;
            int maxAttempts = 5;
            boolean guessed = false;

            System.out.println("\n===== NUMBER GUESSING GAME =====");
            System.out.println("I have selected a number between 1 and 100.");
            System.out.println("You have " + maxAttempts + " attempts.");

            // Give user 5 attempts
            while (attempts < maxAttempts) {

                System.out.print("Enter your guess: ");
                int guess = sc.nextInt();

                attempts++;

                // Compare guess with random number
                if (guess == number) {
                    System.out.println("🎉 Correct! You guessed the number.");
                    System.out.println("Number of attempts: " + attempts);

                    score++;
                    guessed = true;
                    break;
                }
                else if (guess < number) {
                    System.out.println("Too Low! Try again.");
                }
                else {
                    System.out.println("Too High! Try again.");
                }
            }

            // If user couldn't guess
            if (!guessed) {
                System.out.println("Sorry! You used all attempts.");
                System.out.println("The correct number was: " + number);
            }

            // Display score
            System.out.println("Your Score: " + score);

            // Ask for another round
            System.out.print("Do you want to play again? (Y/N): ");
            playAgain = sc.next().charAt(0);

        } while (playAgain == 'Y' || playAgain == 'y');

        System.out.println("\n===== GAME OVER =====");
        System.out.println("Final Score: " + score);

        sc.close();
    }
}