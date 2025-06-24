import java.util.Scanner;

public class SubstringOccurrences {

    public static int countSubstringOccurrences(String text, String subStr) {
        int count = 0;
        for (int i = 0; i <= text.length() - subStr.length(); i++) {
            if (text.substring(i, i + subStr.length()).equals(subStr)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the main string: ");
        String text = scanner.nextLine();

        System.out.print("Enter the substring to search: ");
        String subStr = scanner.nextLine();

        int occurrences = countSubstringOccurrences(text, subStr);
        System.out.println("The substring '" + subStr + "' occurred " + occurrences + " times.");
    }
}
