import java.util.Scanner;

public class TrimSpaces {

    public static int[] findStartEnd(String text) {
        int start = 0;
        int end = text.length() - 1;
        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }
        return new int[]{start, end};
    }

    public static String substringCustom(String text, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i <= end; i++) {
            sb.append(text.charAt(i));
        }
        return sb.toString();
    }

    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        int len = s1.length();
        for (int i = 0; i < len; i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        int[] bounds = findStartEnd(text);
        String trimmedCustom = (bounds[0] <= bounds[1]) ? substringCustom(text, bounds[0], bounds[1]) : "";
        String trimmedBuiltIn = text.trim();
        boolean isEqual = compareStrings(trimmedCustom, trimmedBuiltIn);
        System.out.println("Custom Trimmed: '" + trimmedCustom + "'");
        System.out.println("Built-in Trimmed: '" + trimmedBuiltIn + "'");
        System.out.println("Are both trimmed strings equal? " + isEqual);
    }
}
