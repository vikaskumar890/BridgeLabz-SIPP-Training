import java.util.Scanner;

public class ToUpperCaseDemo {

    public static String toUpperCaseUsingCharAt(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                sb.append((char) (ch - 32));
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public static boolean compareStringsUsingCharAt(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter text: ");
        String input = scanner.nextLine();

        String upperUserDefined = toUpperCaseUsingCharAt(input);
        String upperBuiltIn = input.toUpperCase();

        System.out.println("User-defined uppercase: " + upperUserDefined);
        System.out.println("Built-in uppercase: " + upperBuiltIn);
        System.out.println("Are both uppercase strings equal? " + compareStringsUsingCharAt(upperUserDefined, upperBuiltIn));

        scanner.close();
    }
}
