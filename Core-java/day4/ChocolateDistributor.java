import java.util.Scanner;

public class ChocolateDistributor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] inputs = new int[2];

        System.out.print("Enter number of chocolates: ");
        inputs[0] = sc.nextInt();

        System.out.print("Enter number of children: ");
        inputs[1] = sc.nextInt();

        int[] result = findRemainderAndQuotient(inputs[0], inputs[1]);
        System.out.println("Each child gets: " + result[0] + " chocolates");
        System.out.println("Remaining chocolates: " + result[1]);
    }

    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int[] output = new int[2];
        output[0] = number / divisor;  // quotient
        output[1] = number % divisor;  // remainder
        return output;
    }
}
