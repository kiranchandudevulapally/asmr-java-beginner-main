import java.util.Scanner;

public class FibonacciGenerate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of fibonacci to generate: ");
        int n = scanner.nextInt();
        System.out.println("Recursive approach: ");
        for (int num : generate(n)) {
            System.out.print(num + " ");
        }
        System.out.println("\nIterative approach:");
        for (int num : iterative(n)) {
            System.out.print(num + " ");
        }

        scanner.close();
    }

    static int[] generate(int n) {
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = fibonacciN(i);
        }
        return res;
    }

    static int fibonacciN(int n) {
        if (n <= 1) {
            return 1;
        }
        return fibonacciN(n - 1) + fibonacciN(n - 2);
    }


    static int[] iterative(int n) {
        int[] res = new int[n];
        res[0] = 1;
        res[1] = 1;
        for (int i = 2; i < n; i++) {
            res[i] = res[i - 1] + res[i - 2];
        }
        return res;
    }
}
