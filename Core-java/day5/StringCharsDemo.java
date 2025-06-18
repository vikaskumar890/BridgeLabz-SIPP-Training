import java.util.Scanner;

public class StringCharsDemo {

    // Method to return characters in a string without using toCharArray()
    public static char[] getChars(String str) {
        int length = str.length();
        char[] chars = new char[length];
        for (int i = 0; i < length; i++) {
            chars[i] = str.charAt(i);
        }
        return chars;
    }

    // Method to compare two char arrays and return boolean result
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        char[] userDefinedChars = getChars(input);
        char[] builtInChars = input.toCharArray();

        System.out.print("User-defined chars: ");
        for (char c : userDefinedChars) {
            System.out.print(c + " ");
        }
        System.out.println();

        System.out.print("Built-in chars: ");
        for (char c : builtInChars) {
            System.out.print(c + " ");
        }
        System.out.println();

        boolean result = compareCharArrays(userDefinedChars, builtInChars);
        System.out.println("Are both char arrays equal? " + result);

        scanner.close();
    }
}
