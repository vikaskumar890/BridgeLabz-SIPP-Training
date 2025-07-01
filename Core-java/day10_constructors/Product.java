public class Product {

    private String productName;
    private double price;
    private static int totalProducts = 0;

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: ₹" + price);
    }

    public static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }

    public static void main(String[] args) {
        Product p1 = new Product("Monitor", 8500);
        Product p2 = new Product("Keyboard", 1200);

        System.out.println("=== Product 1 ===");
        p1.displayProductDetails();

        System.out.println("\n=== Product 2 ===");
        p2.displayProductDetails();

        System.out.println("\n=== Total Products Created ===");
        Product.displayTotalProducts();
    }
}
