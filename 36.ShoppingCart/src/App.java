import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShoppingCart shoppingCart = new ShoppingCart();

        boolean running = true;
        while (running) {
            System.out.println("\n--------Shopping Cart--------");
            System.out.println("1. Add Product to Cart");
            System.out.println("2. View Cart");
            System.out.println("3. Calculate total");
            System.out.println("4. Exit");
            System.out.print("Enter an option: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Enter product name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter product price: ");
                    double price = scanner.nextDouble();
                    System.out.print("Enter product quantity: ");
                    int quantity = scanner.nextInt();
                    scanner.nextLine();

                    Product product = new Product(name, price, quantity);
                    shoppingCart.addProduct(product);
                    System.out.println("Product added to the cart.");
                    break;
                case 2:
                    shoppingCart.displayCart();
                    break;
                case 3:
                    double total = shoppingCart.calculateTotal();
                    System.out.println("Total cost: $" + total);
                    break;
                case 4:
                    System.out.println("Exiting the shopping cart system...");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option! Please try again...");
            }
        }
        scanner.close();
    }
}
