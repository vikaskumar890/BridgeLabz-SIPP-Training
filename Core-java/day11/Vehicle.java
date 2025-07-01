public class Vehicle {

    private String ownerName;
    private String vehicleType;
    private final String registrationNumber;
    private static double registrationFee = 5000;

    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    public void displayVehicleDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Registration Fee: ₹" + registrationFee);
        }
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Sandeep Yadav", "Two-Wheeler", "MH12AB1234");
        Vehicle v2 = new Vehicle("Neelam Roy", "Four-Wheeler", "DL05XY9876");

        v1.displayVehicleDetails();
        System.out.println();
        v2.displayVehicleDetails();

        System.out.println("\nUpdating Registration Fee to ₹6000...");
        Vehicle.updateRegistrationFee(6000);
        System.out.println();
        v1.displayVehicleDetails();
    }
}
