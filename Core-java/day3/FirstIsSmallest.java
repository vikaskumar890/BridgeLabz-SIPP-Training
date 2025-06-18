import java.util.Scanner;

public class FirstIsSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[3];

        System.out.print("Enter first number: ");
        numbers[0] = sc.nextInt();

        System.out.print("Enter second number: ");
        numbers[1] = sc.nextInt();

        System.out.print("Enter third number: ");
        numbers[2] = sc.nextInt();

        boolean isSmallest = numbers[0] < numbers[1] && numbers[0] < numbers[2];
        System.out.println("Is the first number the smallest? " + isSmallest);
    }
}
