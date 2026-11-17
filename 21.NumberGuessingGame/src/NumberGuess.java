import java.util.Random;
import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String again;
        int randomNumber, guess;
        int attempts;
        System.out.println("Welcome to the number guessing game!!!\n");

        do {
            randomNumber = Math.abs(random.nextInt() % 100);
            attempts = 0;

            while (true) {
                System.out.print("Take a guess: ");
                guess = scanner.nextInt();

                if (guess > randomNumber) {
                    System.out.println("Too high!");
                    attempts++;
                } else if (guess < randomNumber) {
                    System.out.println("Too low!");
                    attempts++;
                } else {
                    System.out.println("\nCorrect!");
                    System.out.println("The correct answer was " + randomNumber);
                    System.out.println("It took you " + attempts + " attempts to find\n");
                    break;
                }
            }

            scanner.nextLine();
            System.out.print("Do you want to play again?(y, n): ");
            again = scanner.nextLine();
            System.out.println();
        } while(!again.equalsIgnoreCase("n"));
        System.out.println("Thanks for playing!");


        scanner.close();
    }
}
