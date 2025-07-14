package OOPS.Day3;
interface Discountable {
    double applyDiscount();
    String getDiscountDetails();
}

abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() { return itemName; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }

    public void setQuantity(int quantity) {
        if (quantity > 0) this.quantity = quantity;
    }

    public abstract double calculateTotalPrice();

    public void getItemDetails() {
        System.out.println("Item: " + itemName + ", Price: ₹" + price + ", Qty: " + quantity);
    }
}

class VegItem extends FoodItem implements Discountable {
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) - applyDiscount();
    }

    public double applyDiscount() {
        return getPrice() * getQuantity() * 0.10;
    }

    public String getDiscountDetails() {
        return "10% veg item discount";
    }
}

class NonVegItem extends FoodItem implements Discountable {
    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    public double calculateTotalPrice() {
        double base = getPrice() * getQuantity();
        return base + 50 - applyDiscount(); // extra charge ₹50
    }

    public double applyDiscount() {
        return getPrice() * getQuantity() * 0.05;
    }

    public String getDiscountDetails() {
        return "5% non-veg discount with ₹50 extra charge";
    }
}

public class FoodDeliverySystem {
    public static void main(String[] args) {
        FoodItem[] order = {
            new VegItem("Paneer Roll", 150, 2),
            new NonVegItem("Chicken Burger", 200, 1)
        };

        for (FoodItem item : order) {
            item.getItemDetails();
            Discountable d = (Discountable) item;
            System.out.println(d.getDiscountDetails());
            System.out.println("Discount: ₹" + d.applyDiscount());
            System.out.println("Total Price: ₹" + item.calculateTotalPrice());
            System.out.println("------------------------");
        }
    }
}

