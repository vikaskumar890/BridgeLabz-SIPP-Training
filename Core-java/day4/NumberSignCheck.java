import java.util.Scanner;

public class NumberSignCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] input = new int[1];

        System.out.print("Enter a number: ");
        input[0] = sc.nextInt();

        int result = checkSign(input[0]);

        if (result > 0) System.out.println("Positive Number");
        else if (result < 0) System.out.println("Negative Number");
        else System.out.println("Zero");
    }

    public static int checkSign(int num) {
        if (num > 0) return 1;
        else if (num < 0) return -1;
        else return 0;
    }
}
