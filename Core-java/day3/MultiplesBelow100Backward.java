import java.util.Scanner;

public class MultiplesBelow100Backward {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] number = new int[1];

        System.out.print("Enter a positive number less than 100: ");
        number[0] = sc.nextInt();

        if (number[0] <= 0 || number[0] >= 100) {
            System.out.println("Invalid input. Please enter a number between 1 and 99.");
            return;
        }

        System.out.println("Multiples of " + number[0] + " below 100 (in reverse):");
        for (int i = 99; i >= 1; i--) {
            if (i % number[0] == 0) {
                System.out.println(i);
            }
        }
    }
}
