import java.util.Scanner;

public class SpringSeasonCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] date = new int[2];

        System.out.print("Enter month (1-12): ");
        date[0] = sc.nextInt();

        System.out.print("Enter day (1-31): ");
        date[1] = sc.nextInt();

        int month = date[0];
        int day = date[1];

        boolean isSpring = (month == 3 && day >= 20) ||
                           (month == 4) ||
                           (month == 5) ||
                           (month == 6 && day <= 20);

        if (isSpring) {
            System.out.println("It's a Spring Season.");
        } else {
            System.out.println("Not a Spring Season.");
        }
    }
}
