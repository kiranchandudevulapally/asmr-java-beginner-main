import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check: ");
        int number = scanner.nextInt();
        System.out.println(isPrime(number) ?
                           "The number " + number + " is Prime" :
                           "The number " + number + " is NOT Prime");
        scanner.close();
    }

    static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        else if (number <= 3) {
            return true;
        }
        else if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }
        int i = 5;
        while (i * i <= number) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
            i += 6;
        }
        return true;
    }
}
