import java.util.Scanner;

public class SubstringDemo {

    public static String substringUsingCharAt(String str, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < end; i++) {
            sb.append(str.charAt(i));
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

        System.out.print("Enter the string: ");
        String input = scanner.nextLine();

        System.out.print("Enter start index: ");
        int start = scanner.nextInt();

        System.out.print("Enter end index: ");
        int end = scanner.nextInt();

        String subStrCharAt = substringUsingCharAt(input, start, end);
        String subStrBuiltIn = input.substring(start, end);

        System.out.println("Substring using charAt(): " + subStrCharAt);
        System.out.println("Substring using built-in method: " + subStrBuiltIn);

        boolean isEqual = compareStringsUsingCharAt(subStrCharAt, subStrBuiltIn);
        System.out.println("Are both substrings equal? " + isEqual);

        scanner.close();
    }
}
