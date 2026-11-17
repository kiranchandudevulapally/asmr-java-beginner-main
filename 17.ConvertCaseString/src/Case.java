import java.util.Scanner;

public class Case {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = scanner.nextLine();
        System.out.println("1.To Lowercase\n2.To Uppercase");
        System.out.print("Enter an option (1, 2): ");
        int option = scanner.nextInt();

        if (option == 1) {
            System.out.println("Lowercase: " + string.toLowerCase());
        } else if (option == 2) {
            System.out.println("Uppercase: " + string.toUpperCase());
        } else {
            System.out.println("Invalid option! Please try again...");
        }

        scanner.close();
    }
}
