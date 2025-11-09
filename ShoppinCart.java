import java.util.*;

public class ShoppingCart {
    private List<CartItem> cartItems = new ArrayList<>();

    public void addToCart(Product product, int quantity) {
        cartItems.add(new CartItem(product, quantity));
        System.out.println(quantity + " x " + product.getName() + " added to cart.");
    }

    public void viewCart() {
        if (cartItems.isEmpty()) {
            System.out.println("Your cart is empty.");
            return;
        }

        System.out.println("\nItems in your cart:");
        double total = 0;
        for (CartItem item : cartItems) {
            System.out.println(item.getProduct().getName() + " x " + item.getQuantity() + " = Rs." + item.getTotalPrice());
            total += item.getTotalPrice();
        }
        System.out.println("Total: Rs." + total);
    }

    public double checkout() {
        double total = 0;
        for (CartItem item : cartItems)
            total += item.getTotalPrice();
        cartItems.clear();
        return total;
    }

    public boolean isEmpty() {
        return cartItems.isEmpty();
    }
}
