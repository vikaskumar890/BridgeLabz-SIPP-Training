import java.util.Scanner;

public class OddEvenPrinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] number = new int[1];

        System.out.print("Enter a natural number: ");
        number[0] = sc.nextInt();

        if (number[0] < 1) {
            System.out.println("Please enter a valid natural number (1 or greater).");
            return;
        }

        for (int i = 1; i <= number[0]; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is even.");
            } else {
                System.out.println(i + " is odd.");
            }
        }
    }
}
