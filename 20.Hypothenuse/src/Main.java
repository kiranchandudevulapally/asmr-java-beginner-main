import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter side a of triangle: ");
        double a = scanner.nextDouble();
        System.out.print("Enter side a of triangle: ");
        double b = scanner.nextDouble();

        double c = Math.sqrt(a * a + b * b);
        System.out.println("Result: " + c);

        scanner.close();
    }
}
