import java.util.Scanner;

public class NumComparer {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int total = sum(numbers);
        System.out.println("Total sum is " + total);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number a: ");
        int a = scanner.nextInt();
        System.out.print("Enter number b: ");
        int b = scanner.nextInt();
        if (isAGreater(a, b)) {
            System.out.printf("Number %d is greater than number %d", a, b);
        } else {
            System.out.printf("Number %d is NOT greater than number %d", a, b);
        }

        scanner.close();
    }

    static boolean isAGreater(int a, int b) {
        return a > b;
    }

    static int sum(int... numbers) {  // int[] numbers
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }
}
