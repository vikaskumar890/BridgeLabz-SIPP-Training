import java.util.Scanner;

public class EvenPrimeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = scanner.nextInt();

        if (number == 2) {
            System.out.println(number + " is an even prime number.");
        } else {
            System.out.println(number + " is not an even prime number.");
        }

        scanner.close();
    }
}
