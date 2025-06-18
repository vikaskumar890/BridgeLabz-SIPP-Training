import java.util.Scanner;

public class HarshadNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] number = new int[1];

        System.out.print("Enter a number: ");
        number[0] = sc.nextInt();

        int original = number[0];
        int sum = 0;

        while (number[0] != 0) {
            sum += number[0] % 10;
            number[0] /= 10;
        }

        if (original % sum == 0) {
            System.out.println(original + " is a Harshad Number.");
        } else {
            System.out.println(original + " is NOT a Harshad Number.");
        }
    }
}
