import java.util.Scanner;

public class Management {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("------Library management system------");
        System.out.print("Enter a name of the library: ");
        String name = scanner.nextLine();
        System.out.print("Enter a year it was opened: ");
        int yearOpened = scanner.nextInt();

        Library library = new Library(name, yearOpened);
        boolean running = true;

        while (running) {
            System.out.println("\n1.Add Book");
            System.out.println("2.Remove book");
            System.out.println("3.Show books");
            System.out.println("4.Exit");
            System.out.print("Enter an option: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    library.addBook(scanner);
                    break;
                case 2:
                    library.removeBook(scanner);
                    break;
                case 3:
                    library.displayLibrary();
                    break;
                case 4:
                    System.out.println("Exiting library management system...");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option! Please try again...");
            }
        }

        scanner.close();
    }
}
