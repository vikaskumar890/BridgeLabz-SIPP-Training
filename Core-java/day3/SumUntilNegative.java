import java.util.Scanner;

public class SumUntilNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        while (true) {
            System.out.print("Enter a number: ");
            int number = sc.nextInt();

            if (number <= 0) {
                break;
            }
            sum += number;
        }

        System.out.println("The total sum is: " + sum);
    }
}
