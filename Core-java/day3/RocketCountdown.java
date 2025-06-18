import java.util.Scanner;

public class RocketCountdown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] counter = new int[1];

        System.out.print("Enter countdown start value: ");
        counter[0] = sc.nextInt();

        System.out.println("Rocket launch countdown:");
        for (int i = counter[0]; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("Liftoff!");
    }
}
