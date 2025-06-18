import java.util.Scanner;

public class GreatestFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] number = new int[1];

        System.out.print("Enter a number: ");
        number[0] = sc.nextInt();

        int greatestFactor = 1;

        for (int i = number[0] - 1; i >= 1; i--) {
            if (number[0] % i == 0) {
                greatestFactor = i;
                break;
            }
        }

        System.out.println("Greatest factor of " + number[0] + " (excluding itself) is: " + greatestFactor);
    }
}
