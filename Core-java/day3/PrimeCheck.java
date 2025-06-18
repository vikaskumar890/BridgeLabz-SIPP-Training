import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] number = new int[1];

        System.out.print("Enter a number greater than 1: ");
        number[0] = sc.nextInt();

        if (number[0] <= 1) {
            System.out.println("Number must be greater than 1.");
            return;
        }

        boolean isPrime = true;

        for (int i = 2; i <= number[0] / 2; i++) {
            if (number[0] % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(number[0] + " is a Prime Number.");
        } else {
            System.out.println(number[0] + " is NOT a Prime Number.");
        }
    }
}
