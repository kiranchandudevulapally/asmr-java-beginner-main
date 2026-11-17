import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private final List<Product> cart;

    ShoppingCart() {
        this.cart = new ArrayList<>();
    }

    public void addProduct(Product product) {
        this.cart.add(product);
    }

    public double calculateTotal() {
        double total = 0;
        for (Product product : cart) {
            total += product.getTotalPrice();
        }
        return total;
    }
    public void displayCart() {
        if (cart.isEmpty()) {
            System.out.println("Your shopping cart is empty.");
        } else {
            System.out.println("Shopping Cart:");
            for (Product product : this.cart) {
                System.out.println(product);
            }
        }
    }
}
