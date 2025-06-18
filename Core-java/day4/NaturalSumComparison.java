import java.util.Scanner;

public class NaturalSumComparison {
    public static int recursiveSum(int n) {
        if (n == 1) return 1;
        return n + recursiveSum(n - 1);
    }

    public static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] input = new int[1];

        System.out.print("Enter a natural number: ");
        input[0] = sc.nextInt();

        if (input[0] < 1) {
            System.out.println("Not a natural number.");
            return;
        }

        int sumByRecursion = recursiveSum(input[0]);
        int sumByFormula = formulaSum(input[0]);

        System.out.println("Sum using recursion: " + sumByRecursion);
        System.out.println("Sum using formula: " + sumByFormula);
        System.out.println("Results match: " + (sumByRecursion == sumByFormula));
    }
}
