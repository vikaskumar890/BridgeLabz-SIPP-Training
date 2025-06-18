import java.util.Scanner;

public class StringCompareDemo {

    public static boolean compareUsingCharAt(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();

        boolean result = compareUsingCharAt(str1, str2);
        System.out.println("Comparison using charAt(): " + result);
        System.out.println("Comparison using equals(): " + str1.equals(str2));

        scanner.close();
    }
}
