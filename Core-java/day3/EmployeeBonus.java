import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] input = new double[2];

        System.out.print("Enter salary: ");
        input[0] = sc.nextDouble();

        System.out.print("Enter years of service: ");
        input[1] = sc.nextDouble();

        if (input[1] > 5) {
            double bonus = 0.05 * input[0];
            System.out.println("Bonus amount: " + bonus);
        } else {
            System.out.println("No bonus for service less than or equal to 5 years.");
        }
    }
}
