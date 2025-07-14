package OOPS.Day3;
interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

abstract class Product {
    private String productId;
    private String name;
    private double price;

    public Product(String productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public String getProductId() { return productId; }
    public String getName() { return name; }
    public double getPrice() { return price; }

    public void setPrice(double price) {
        if (price > 0) this.price = price;
    }

    public abstract double calculateDiscount();

    public double finalPrice() {
        double tax = this instanceof Taxable ? ((Taxable) this).calculateTax() : 0;
        return price + tax - calculateDiscount();
    }

    public void showDetails() {
        System.out.println("Product ID: " + productId + ", Name: " + name + ", Price: ₹" + price);
    }
}

class Electronics extends Product implements Taxable {
    public Electronics(String productId, String name, double price) {
        super(productId, name, price);
    }

    public double calculateDiscount() {
        return getPrice() * 0.10;
    }

    public double calculateTax() {
        return getPrice() * 0.18;
    }

    public String getTaxDetails() {
        return "18% GST applied.";
    }
}

class Clothing extends Product implements Taxable {
    public Clothing(String productId, String name, double price) {
        super(productId, name, price);
    }

    public double calculateDiscount() {
        return getPrice() * 0.20;
    }

    public double calculateTax() {
        return getPrice() * 0.05;
    }

    public String getTaxDetails() {
        return "5% GST applied.";
    }
}

class Groceries extends Product {
    public Groceries(String productId, String name, double price) {
        super(productId, name, price);
    }

    public double calculateDiscount() {
        return getPrice() * 0.05;
    }
}

public class ECommercePlatform {
    public static void main(String[] args) {
        Product[] products = {
            new Electronics("E001", "Smartphone", 25000),
            new Clothing("C001", "T-Shirt", 800),
            new Groceries("G001", "Rice Bag", 1200)
        };

        for (Product p : products) {
            p.showDetails();
            if (p instanceof Taxable) {
                System.out.println(((Taxable) p).getTaxDetails());
            }
            System.out.println("Discount: ₹" + p.calculateDiscount());
            System.out.println("Final Price: ₹" + p.finalPrice());
            System.out.println("---------------------");
        }
    }
}

