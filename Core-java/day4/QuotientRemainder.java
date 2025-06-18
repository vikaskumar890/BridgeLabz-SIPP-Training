import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] input = new int[2];

        System.out.print("Enter the dividend: ");
        input[0] = sc.nextInt();

        System.out.print("Enter the divisor: ");
        input[1] = sc.nextInt();

        int[] result = findQuotientAndRemainder(input[0], input[1]);
        System.out.println("Quotient: " + result[0]);
        System.out.println("Remainder: " + result[1]);
    }

    public static int[] findQuotientAndRemainder(int number, int divisor) {
        return new int[]{number / divisor, number % divisor};
    }
}
