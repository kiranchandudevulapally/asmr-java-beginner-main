import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check: ");
        int number = scanner.nextInt();
        if (isEven(number)) {
            System.out.println("Number " + number + " is even");
        }
        else{
            System.out.println("Number " + number + " is odd");
        }

        scanner.close();
    }

    static boolean isEven(int number) {
        return number % 2 == 0;
    }
}

