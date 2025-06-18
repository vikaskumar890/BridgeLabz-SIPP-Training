import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount: ");
        int amount = scanner.nextInt();

        int[] notes = {1000, 500, 100, 50, 10, 5, 2, 1};
        int totalNotes = 0;

        for (int note : notes) {
            if (amount >= note) {
                int count = amount / note;
                totalNotes += count;
                amount = amount % note;
                System.out.println("Number of " + note + " notes: " + count);
            }
        }

        System.out.println("Minimum number of notes required: " + totalNotes);
    }
}
