import java.util.Scanner;

public class HandshakeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] input = new int[1];

        System.out.print("Enter number of students: ");
        input[0] = sc.nextInt();

        int handshakes = calculateHandshakes(input[0]);
        System.out.println("Maximum number of handshakes: " + handshakes);
    }

    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }
}
