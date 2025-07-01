public class Vehicle {

    private String ownerName;
    private String vehicleType;
    private static double registrationFee = 5000;

    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: ₹" + registrationFee);
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Ravi Sharma", "Two-Wheeler");
        Vehicle v2 = new Vehicle("Neha Verma", "Four-Wheeler");

        System.out.println("=== Vehicle 1 ===");
        v1.displayVehicleDetails();

        System.out.println("\n=== Vehicle 2 ===");
        v2.displayVehicleDetails();

        Vehicle.updateRegistrationFee(6500);

        System.out.println("\n=== After Registration Fee Update ===");
        v1.displayVehicleDetails();
    }
}
