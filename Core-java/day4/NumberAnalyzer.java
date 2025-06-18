import java.util.Scanner;

public class NumberAnalyzer {
    public static boolean isPositive(int n) {
        return n > 0;
    }

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static int compare(int a, int b) {
        if (a > b) return 1;
        if (a == b) return 0;
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            if (isPositive(numbers[i])) {
                System.out.print(numbers[i] + " is Positive and ");
                System.out.println(isEven(numbers[i]) ? "Even" : "Odd");
            } else {
                System.out.println(numbers[i] + " is Negative");
            }
        }

        int result = compare(numbers[0], numbers[4]);
        if (result == 0) {
            System.out.println("First and last elements are equal.");
        } else if (result > 0) {
            System.out.println("First element is greater than last.");
        } else {
            System.out.println("First element is less than last.");
        }
    }
}
