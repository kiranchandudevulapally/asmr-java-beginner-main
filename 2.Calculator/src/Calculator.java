import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String again = "";
        int option;
        double num1, num2, res;
        System.out.println("Welcome to this calculator app!");

        do {
            System.out.println("\n1.Add\n2.Subtract\n3.Multiply\n4.Divide");
            System.out.print("Enter an option: ");
            option = scanner.nextInt();

            if (option <= 0 || option > 4) {
                System.out.println("Invalid option! Please Try again!\n");
                continue;
            }

            System.out.print("Enter number 1: ");
            num1 = scanner.nextLong();

            System.out.print("Enter number 2: ");
            num2 = scanner.nextLong();

            switch(option) {
                case 1 -> {
                    res = num1 + num2;
                    System.out.printf("%.1f + %.1f = %.1f\n", num1, num2, res);
                }
                case 2 -> {
                    res = num1 - num2;
                    System.out.printf("%.1f - %.1f = %.1f\n", num1, num2, res);
                }
                case 3 -> {
                    res = num1 * num2;
                    System.out.printf("%.1f * %.1f = %.2f\n", num1, num2, res);
                }
                case 4 -> {
                    res = num1 / num2;
                    System.out.printf("%.1f / %.1f = %.2f\n", num1, num2, res);
                }
            }
            scanner.nextLine();
            System.out.print("Do you want to calculate again(y, n)?: ");
            again = scanner.nextLine();
        }while(!again.equalsIgnoreCase("n"));

        System.out.println("Thanks for calculating!");
        scanner.close();
    }
}
