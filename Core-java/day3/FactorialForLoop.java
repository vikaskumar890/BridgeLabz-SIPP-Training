import java.util.Scanner;

public class FactorialForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] input = new int[1];

        System.out.print("Enter a positive integer: ");
        input[0] = sc.nextInt();

        if (input[0] < 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        int result = 1;

        for (int i = 1; i <= input[0]; i++) {
            result *= i;
        }

        System.out.println("Factorial of " + input[0] + " is " + result);
    }
}
