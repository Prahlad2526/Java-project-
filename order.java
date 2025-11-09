import java.util.Random;

public class Order {
    private int orderId;
    private double totalAmount;

    public Order(double totalAmount) {
        this.totalAmount = totalAmount;
        this.orderId = new Random().nextInt(10000) + 1000;
    }

    public void displayOrderDetails() {
        System.out.println("\nOrder placed successfully!");
        System.out.println("Order ID: " + orderId);
        System.out.println("Total Amount: Rs." + totalAmount);
        System.out.println("Status: In Transit");
    }
}
