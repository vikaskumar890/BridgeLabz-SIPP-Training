import java.util.Scanner;

public class AbundantNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] number = new int[1];

        System.out.print("Enter a number: ");
        number[0] = sc.nextInt();

        int sum = 0;

        for (int i = 1; i < number[0]; i++) {
            if (number[0] % i == 0) {
                sum += i;
            }
        }

        if (sum > number[0]) {
            System.out.println(number[0] + " is an Abundant Number.");
        } else {
            System.out.println(number[0] + " is NOT an Abundant Number.");
        }
    }
}
