import java.util.Scanner;

public class FactorsForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] number = new int[1];

        System.out.print("Enter a positive integer: ");
        number[0] = sc.nextInt();

        if (number[0] <= 0) {
            System.out.println("Please enter a valid positive integer.");
            return;
        }

        System.out.println("Factors of " + number[0] + ":");
        for (int i = 1; i < number[0]; i++) {
            if (number[0] % i == 0) {
                System.out.println(i);
            }
        }
    }
}
