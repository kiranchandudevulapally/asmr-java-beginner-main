import java.util.Scanner;

public class BankManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter account holder name: ");
        String name = scanner.nextLine();
        BankAccount account = new BankAccount(1000, name);
        boolean running = true;

        while (running) {
            System.out.println("\nBank account Menu:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. CheckBalance");
            System.out.println("4. Holder Name");
            System.out.println("5. Exit");
            System.out.print("Enter you choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.println("Enter withdrawal amount: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    account.checkBalance();
                    break;
                case 4:
                    account.showAccountHolder();
                    break;
                case 5:
                    System.out.println("Exiting the bank account management system...");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice.. Please try again!");
            }
        }
        scanner.close();
    }
}
