import java.util.Scanner;

public class LeapYearSingleCondition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] year = new int[1];

        System.out.print("Enter a year (≥ 1582): ");
        year[0] = sc.nextInt();

        if (year[0] >= 1582 &&
            ((year[0] % 4 == 0 && year[0] % 100 != 0) || (year[0] % 400 == 0))) {
            System.out.println(year[0] + " is a Leap Year.");
        } else {
            System.out.println(year[0] + " is NOT a Leap Year.");
        }
    }
}
