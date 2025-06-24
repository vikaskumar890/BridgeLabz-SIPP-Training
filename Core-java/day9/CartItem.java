public class CartItem {

    private String itemName;
    private double price;
    private int quantity;

    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public void addItem(int qty) {
        quantity += qty;
        System.out.println(qty + " items added to the cart.");
    }

    public void removeItem(int qty) {
        if (qty <= quantity) {
            quantity -= qty;
            System.out.println(qty + " items removed from the cart.");
        } else {
            System.out.println("Cannot remove more items than available in the cart.");
        }
    }

    public double getTotalCost() {
        return price * quantity;
    }

    public void displayCartDetails() {
        System.out.println("Item Name: " + itemName);
        System.out.println("Price per Unit: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + getTotalCost());
    }

    public static void main(String[] args) {
        CartItem cart = new CartItem("Laptop", 50000, 1);

        System.out.println("=== Initial Cart ===");
        cart.displayCartDetails();

        System.out.println("\n=== Adding Items ===");
        cart.addItem(2);
        cart.displayCartDetails();

        System.out.println("\n=== Removing Items ===");
        cart.removeItem(1);
        cart.displayCartDetails();

        System.out.println("\n=== Trying to Remove More Items Than Available ===");
        cart.removeItem(5);
    }
}
