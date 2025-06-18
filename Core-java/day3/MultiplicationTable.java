import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] number = new int[1];

        System.out.print("Enter a number: ");
        number[0] = sc.nextInt();

        for (int i = 6; i <= 9; i++) {
            System.out.println(number[0] + " * " + i + " = " + (number[0] * i));
        }
    }
}
