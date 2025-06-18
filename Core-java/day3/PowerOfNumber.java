import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] input = new int[2];

        System.out.print("Enter the base number: ");
        input[0] = sc.nextInt();

        System.out.print("Enter the power: ");
        input[1] = sc.nextInt();

        int result = 1;

        for (int i = 1; i <= input[1]; i++) {
            result *= input[0];
        }

        System.out.println(input[0] + " raised to the power of " + input[1] + " is: " + result);
    }
}
