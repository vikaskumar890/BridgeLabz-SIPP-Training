import java.util.Scanner;

public class ArmstrongNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] number = new int[1];

        System.out.print("Enter a number: ");
        number[0] = sc.nextInt();

        int original = number[0];
        int sum = 0;

        while (number[0] != 0) {
            int digit = number[0] % 10;
            sum += digit * digit * digit;
            number[0] /= 10;
        }

        if (sum == original) {
            System.out.println(original + " is an Armstrong Number.");
        } else {
            System.out.println(original + " is NOT an Armstrong Number.");
        }
    }
}
