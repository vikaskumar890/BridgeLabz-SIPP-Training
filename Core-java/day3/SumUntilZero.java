import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] input = new double[1];
        double total = 0.0;

        while (true) {
            System.out.print("Enter a number (0 to stop): ");
            input[0] = sc.nextDouble();

            if (input[0] == 0.0) {
                break;
            }

            total += input[0];
        }

        System.out.println("The total sum is: " + total);
    }
}
