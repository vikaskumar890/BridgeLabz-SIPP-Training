import java.util.Scanner;
import java.util.Random;

public class VotingEligibility {

    public static int[] generateRandomAges(int n) {
        Random rand = new Random();
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = 10 + rand.nextInt(90); // random age between 10 and 99
        }
        return ages;
    }

    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            if (ages[i] < 0) {
                result[i][1] = "False";
            } else if (ages[i] >= 18) {
                result[i][1] = "True";
            } else {
                result[i][1] = "False";
            }
        }
        return result;
    }

    public static void displayResults(String[][] data) {
        System.out.printf("%-10s%-10s\n", "Age", "Can Vote");
        for (String[] row : data) {
            System.out.printf("%-10s%-10s\n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();

        int[] ages = generateRandomAges(n);
        String[][] votingData = checkVotingEligibility(ages);
        displayResults(votingData);

        scanner.close();
    }
}
