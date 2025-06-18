import java.util.Scanner;

public class GreatestFactorWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] number = new int[1];

        System.out.print("Enter a number: ");
        number[0] = sc.nextInt();

        int greatestFactor = 1;
        int counter = number[0] - 1;

        while (counter >= 1) {
            if (number[0] % counter == 0) {
                greatestFactor = counter;
                break;
            }
            counter--;
        }

        System.out.println("Greatest factor of " + number[0] + " (excluding itself) is: " + greatestFactor);
    }
}
