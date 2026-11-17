import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = scanner.nextLine();
        System.out.printf("Enter a first index (0, %d): ", string.length());
        int first = scanner.nextInt();
        System.out.printf("Enter a second index (0, %d): ", string.length());
        int second = scanner.nextInt();
        String res = string.substring(first, second);
        System.out.println("\nThe result is: " + res);

        scanner.close();
    }
}
