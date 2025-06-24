
import java.util.Scanner;

public class AnagramCheck {

    public static boolean areAnagrams(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        int[] freq = new int[256];

        for (char ch : s1.toCharArray()) {
            freq[ch]++;
        }

        for (char ch : s2.toCharArray()) {
            freq[ch]--;
        }

        for (int count : freq) {
            if (count != 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = scanner.nextLine();

        System.out.print("Enter second string: ");
        String s2 = scanner.nextLine();

        if (areAnagrams(s1, s2)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are NOT anagrams.");
        }
    }
}
