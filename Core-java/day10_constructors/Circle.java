public class Circle {

    private double radius;

    public Circle() {
        this(1.0);
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public void displayDetails() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + (Math.PI * radius * radius));
    }

    public static void main(String[] args) {
        Circle defaultCircle = new Circle();
        Circle customCircle = new Circle(5.5);

        System.out.println("=== Default Circle ===");
        defaultCircle.displayDetails();

        System.out.println("\n=== Custom Circle ===");
        customCircle.displayDetails();
    }
} 
