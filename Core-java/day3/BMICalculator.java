import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] input = new double[2];

        System.out.print("Enter weight in kilograms: ");
        input[0] = sc.nextDouble();

        System.out.print("Enter height in centimeters: ");
        input[1] = sc.nextDouble();

        // Convert height to meters
        double heightInMeters = input[1] / 100.0;
        double bmi = input[0] / (heightInMeters * heightInMeters);

        System.out.printf("Your BMI is: %.2f%n", bmi);

        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi < 24.9) {
            System.out.println("Normal weight");
        } else if (bmi < 29.9) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}
