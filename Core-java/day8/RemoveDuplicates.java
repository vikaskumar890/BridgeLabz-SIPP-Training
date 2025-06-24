import java.util.Scanner;

public class RemoveDuplicates {

    public static String removeDuplicates(String input) {
        String result = "";
        for (char ch : input.toCharArray()) {
            if (result.indexOf(ch) == -1) { 
                result += ch;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String modifiedString = removeDuplicates(input);
        System.out.println("String after removing duplicates: " + modifiedString);
    }
}
