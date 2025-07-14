package OOPS.Day3;
interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public String getVehicleNumber() { return vehicleNumber; }
    public String getType() { return type; }
    public double getRentalRate() { return rentalRate; }

    public abstract double calculateRentalCost(int days);

    public void displayDetails() {
        System.out.println("Vehicle: " + vehicleNumber + ", Type: " + type + ", Rate/Day: ₹" + rentalRate);
    }
}

class Car extends Vehicle implements Insurable {
    public Car(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Car", rentalRate);
    }

    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    public double calculateInsurance() {
        return 2000;
    }

    public String getInsuranceDetails() {
        return "Flat ₹2000 car insurance";
    }
}

class Bike extends Vehicle implements Insurable {
    public Bike(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Bike", rentalRate);
    }

    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    public double calculateInsurance() {
        return 500;
    }

    public String getInsuranceDetails() {
        return "Flat ₹500 bike insurance";
    }
}

class Truck extends Vehicle implements Insurable {
    public Truck(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Truck", rentalRate);
    }

    public double calculateRentalCost(int days) {
        return getRentalRate() * days + 1500;
    }

    public double calculateInsurance() {
        return 3000;
    }

    public String getInsuranceDetails() {
        return "Flat ₹3000 truck insurance";
    }
}

public class VehicleRentalSystem {
    public static void main(String[] args) {
        Vehicle[] fleet = {
            new Car("MH12AB1234", 2000),
            new Bike("DL09XY9876", 500),
            new Truck("RJ07ZZ1111", 3500)
        };

        int rentalDays = 5;

        for (Vehicle v : fleet) {
            v.displayDetails();
            System.out.println("Rental for " + rentalDays + " days: ₹" + v.calculateRentalCost(rentalDays));
            if (v instanceof Insurable) {
                System.out.println(((Insurable) v).getInsuranceDetails());
                System.out.println("Insurance: ₹" + ((Insurable) v).calculateInsurance());
            }
            System.out.println("-------------------------");
        }
    }
}
