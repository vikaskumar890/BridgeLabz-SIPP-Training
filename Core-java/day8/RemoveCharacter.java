import java.util.Scanner;

public class RemoveCharacter {

    public static String removeCharacter(String input, char chToRemove) {
        String result = "";
        for (char ch : input.toCharArray()) {
            if (ch != chToRemove) {
                result += ch;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.print("Enter the character to remove: ");
        char ch = scanner.next().charAt(0);

        String modifiedString = removeCharacter(input, ch);
        System.out.println("Modified String: " + modifiedString);
    }
}
