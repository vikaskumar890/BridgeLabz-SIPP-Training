import java.util.Scanner;

public class StringCompare {

    public static void compareStrings(String s1, String s2) {
        int minLength = Math.min(s1.length(), s2.length());

        for (int i = 0; i < minLength; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                if (s1.charAt(i) < s2.charAt(i)) {
                    System.out.println(s1 + " comes before " + s2 + " lexicographically.");
                } else {
                    System.out.println(s2 + " comes before " + s1 + " lexicographically.");
                }
                return;
            }
        }

        if (s1.length() == s2.length()) {
            System.out.println("Both strings are equal.");
        } else if (s1.length() < s2.length()) {
            System.out.println(s1 + " comes before " + s2 + " lexicographically.");
        } else {
            System.out.println(s2 + " comes before " + s1 + " lexicographically.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = scanner.nextLine();

        System.out.print("Enter second string: ");
        String s2 = scanner.nextLine();

        compareStrings(s1, s2);
    }
}
