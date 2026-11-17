import java.util.Scanner;

public class LargestSmallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the numbers of elements:");
        int n = scanner.nextInt();

        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println("Max: " + max(numbers));
        System.out.println("Min: " + min(numbers));

        scanner.close();
    }

    static int max(int[] numbers) {
        int res = numbers[0];
        for (int number : numbers) {
            if (number > res) {
                res = number;
            }
        }
        return res;
    }

    static int min(int[] numbers) {
        int res = numbers[0];
        for (int number : numbers) {
            if (number < res) {
                res = number;
            }
        }
        return res;
    }
}
