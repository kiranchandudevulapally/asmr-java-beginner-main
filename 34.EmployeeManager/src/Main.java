import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("------Employee management system------");
        boolean running = true;
        EmployeeSystem employeeSystem = new EmployeeSystem();

        while (running) {
            System.out.println("\n1. Add employee");
            System.out.println("2. Remove employee");
            System.out.println("3. Display employees");
            System.out.println("4. Exit");
            System.out.print("Enter an option: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    employeeSystem.add(scanner);
                    break;
                case 2:
                    employeeSystem.remove(scanner);
                    break;
                case 3:
                    employeeSystem.display();
                    break;
                case 4:
                    running = false;
                    System.out.println("Exiting employee management system...");
                    break;
                default:
                    System.out.println("Invalid option! Please try again...");
            }
        }

        scanner.close();
    }
}
