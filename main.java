import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Laptop", 55000));
        products.add(new Product(2, "Smartphone", 20000));
        products.add(new Product(3, "Headphones", 1500));
        products.add(new Product(4, "Smartwatch", 3000));

        ShoppingCart cart = new ShoppingCart();
        int choice;

        do {
            System.out.println("\n--- ONLINE SHOPPING SYSTEM ---");
            System.out.println("1. View Products");
            System.out.println("2. Add to Cart");
            System.out.println("3. View Cart");
            System.out.println("4. Checkout");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\nAvailable Products:");
                    for (Product p : products) System.out.println(p);
                    break;

                case 2:
                    System.out.print("Enter product ID to add: ");
                    int id = sc.nextInt();
                    System.out.print("Enter quantity: ");
                    int qty = sc.nextInt();
                    if (id >= 1 && id <= products.size())
                        cart.addToCart(products.get(id - 1), qty);
                    else
                        System.out.println("Invalid product ID!");
                    break;

                case 3:
                    cart.viewCart();
                    break;

                case 4:
                    if (cart.isEmpty()) {
                        System.out.println("Your cart is empty!");
                    } else {
                        double total = cart.checkout();
                        Order order = new Order(total);
                        order.displayOrderDetails();
                    }
                    break;

                case 5:
                    System.out.println("Thank you for shopping with us!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 5);
        sc.close();
    }
}
