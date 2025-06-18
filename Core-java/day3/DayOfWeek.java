import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] date = new int[3];

        System.out.print("Enter month (1-12): ");
        date[0] = sc.nextInt();

        System.out.print("Enter day (1-31): ");
        date[1] = sc.nextInt();

        System.out.print("Enter year (e.g., 2025): ");
        date[2] = sc.nextInt();

        int m = date[0];
        int d = date[1];
        int y = date[2];

        // Adjust for Zeller's algorithm
        if (m < 3) {
            m += 12;
            y -= 1;
        }

        int k = y % 100;
        int j = y / 100;

        int dayOfWeek = (d + (13 * (m + 1)) / 5 + k + (k / 4) + (j / 4) + (5 * j)) % 7;

        // Zeller's output: 0=Saturday, 1=Sunday, ..., 6=Friday
        // Adjust to: 0=Sunday, 1=Monday, ..., 6=Saturday
        int adjustedDay = (dayOfWeek + 6) % 7;

        System.out.println("Day of the week (0=Sunday, ..., 6=Saturday): " + adjustedDay);
    }
}
