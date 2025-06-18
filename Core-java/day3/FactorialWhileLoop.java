import java.util.Scanner;

public class FactorialWhileLoop {
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
        int i = 1;

        while (i <= input[0]) {
            result *= i;
            i++;
        }

        System.out.println("Factorial of " + input[0] + " is " + result);
    }
}
