import java.util.Scanner;

public class FactorsWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] number = new int[1];

        System.out.print("Enter a positive integer: ");
        number[0] = sc.nextInt();

        if (number[0] <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        System.out.println("Factors of " + number[0] + ":");
        int counter = 1;
        while (counter <= number[0]) {
            if (number[0] % counter == 0) {
                System.out.println(counter);
            }
            counter++;
        }
    }
}
