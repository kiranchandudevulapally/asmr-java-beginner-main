import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of factorial digits to generate: ");
        int n = scanner.nextInt();
        int[] res = generateFactorial(n);
        for (int num : res) {
            System.out.print(num + " ");
        }

        scanner.close();
    }

    static int[] generateFactorial(int n) {
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = factorialN(i + 1);
        }
        return res;
    }

    static int factorialN(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorialN(n - 1);
    }
}
