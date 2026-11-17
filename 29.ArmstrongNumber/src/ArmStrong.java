import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check: ");
        int number = scanner.nextInt();

        if (isArmstrong(number)) {
            System.out.printf("The number %d IS armstrong!\n", number);
        } else {
            System.out.printf("The number %d is NOT armstrong!\n", number);
        }

        scanner.close();
    }
    static boolean isArmstrong(int number) {
        int originalNumber = number;
        int len = 0;
        while (number != 0) {
            number /= 10;
            len++;
        }

        int sum = 0;
        number = originalNumber;
        while (number != 0) {
            int digit = number % 10;
            sum += Math.pow(digit, len);
            number /= 10;
        }

        return sum == originalNumber;
    }
}
