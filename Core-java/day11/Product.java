public class Product {

    private String productName;
    private double price;
    private int quantity;
    private final String productID;
    private static double discount = 10.0; // in percent

    public Product(String productName, double price, int quantity, String productID) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }

    public void displayProductDetails() {
        if (this instanceof Product) {
            System.out.println("Product ID: " + productID);
            System.out.println("Product Name: " + productName);
            System.out.println("Price: ₹" + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + discount + "%");
        }
    }

    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    public static void main(String[] args) {
        Product p1 = new Product("Bluetooth Speaker", 2999, 2, "P1001");
        Product p2 = new Product("Wireless Mouse", 799, 3, "P1002");

        p1.displayProductDetails();
        System.out.println();
        p2.displayProductDetails();

        System.out.println("\nUpdating Discount to 15%...");
        Product.updateDiscount(15.0);
        System.out.println();
        p1.displayProductDetails();
    }
}
