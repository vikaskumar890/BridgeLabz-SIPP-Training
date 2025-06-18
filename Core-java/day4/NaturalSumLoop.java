import java.util.Scanner;

public class NaturalSumLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] input = new int[1];

        System.out.print("Enter a natural number: ");
        input[0] = sc.nextInt();

        int sum = findSum(input[0]);
        System.out.println("Sum of first " + input[0] + " natural numbers is: " + sum);
    }

    public static int findSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
