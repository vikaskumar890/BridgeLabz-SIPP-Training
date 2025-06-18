import java.util.Scanner;

public class MultiplesBelow100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] number = new int[1];

        System.out.print("Enter a positive number less than 100: ");
        number[0] = sc.nextInt();

        if (number[0] <= 0 || number[0] >= 100) {
            System.out.println("Invalid input. Please enter a number between 1 and 99.");
            return;
        }

        int counter = number[0] - 1;
        System.out.println("Multiples of " + number[0] + " below 100:");
        while (counter > 1) {
            if (counter % number[0] == 0) {
                System.out.println(counter);
            }
            counter--;
        }
    }
}
