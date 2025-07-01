public class CarRental {

    private String customerName;
    private String carModel;
    private int rentalDays;

    public CarRental() {
        this.customerName = "Unknown";
        this.carModel = "Standard";
        this.rentalDays = 1;
    }

    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    public void calculateTotalCost(double ratePerDay) {
        double total = rentalDays * ratePerDay;
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: ₹" + total);
    }

    public static void main(String[] args) {
        CarRental rental1 = new CarRental("Anjali Singh", "Honda City", 4);
        CarRental rental2 = new CarRental();

        System.out.println("=== Custom Rental ===");
        rental1.calculateTotalCost(1500);

        System.out.println("\n=== Default Rental ===");
        rental2.calculateTotalCost(1000);
    }
}
