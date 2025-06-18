import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] numbers = new double[2];
        String[] operator = new String[1];

        System.out.print("Enter the first number: ");
        numbers[0] = sc.nextDouble();

        System.out.print("Enter the second number: ");
        numbers[1] = sc.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        operator[0] = sc.next();

        switch (operator[0]) {
            case "+":
                System.out.println("Result: " + (numbers[0] + numbers[1]));
                break;
            case "-":
                System.out.println("Result: " + (numbers[0] - numbers[1]));
                break;
            case "*":
                System.out.println("Result: " + (numbers[0] * numbers[1]));
                break;
            case "/":
                if (numbers[1] != 0) {
                    System.out.println("Result: " + (numbers[0] / numbers[1]));
                } else {
                    System.out.println("Error: Division by zero!");
                }
                break;
            default:
                System.out.println("Invalid operator.");
        }
    }
}
