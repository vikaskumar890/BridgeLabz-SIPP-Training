public class MobilePhone {

    private String brand;
    private String model;
    private double price;

    public MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        MobilePhone phone1 = new MobilePhone("Apple", "iPhone 15", 120000);
        MobilePhone phone2 = new MobilePhone("Samsung", "Galaxy S24", 95000);

        System.out.println("=== Mobile Phone 1 ===");
        phone1.displayDetails();

        System.out.println("\n=== Mobile Phone 2 ===");
        phone2.displayDetails();
    }
}
