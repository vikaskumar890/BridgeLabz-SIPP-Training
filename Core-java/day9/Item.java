public class Item {

    private String itemCode;
    private String itemName;
    private double price;

    public Item(String itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    public double calculateTotalCost(int quantity) {
        return price * quantity;
    }

    public void displayDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price per Unit: " + price);
    }

    public static void main(String[] args) {
        Item item1 = new Item("I101", "Laptop", 55000);
        Item item2 = new Item("I102", "Headphones", 1500);

        System.out.println("=== Item 1 ===");
        item1.displayDetails();
        System.out.println("Total Cost for 2 Units: " + item1.calculateTotalCost(2));

        System.out.println("\n=== Item 2 ===");
        item2.displayDetails();
        System.out.println("Total Cost for 5 Units: " + item2.calculateTotalCost(5));
    }
}
