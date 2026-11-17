import java.util.Scanner;


public class GeneratePrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of Prime Numbers to generate: ");
        int num = scanner.nextInt();
        int[] res = generatePrimeNums(num);
        for (int number : res) {
            System.out.print(number + " ");
        }

        scanner.close();
    }

    static int[] generatePrimeNums(int num) {
        int[] res = new int[num];
        int i = 1;
        int count = 0;
        while (count < num) {
            if (isPrime(i)) {
                res[count] = i;
                count++;
            }
            i++;
        }
        return res;
    }

    static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        } else if (number <= 3) {
            return true;
        } else if (number % 2 == 0 || number % 3 == 0) {
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
