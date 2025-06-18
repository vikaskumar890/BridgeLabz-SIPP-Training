import java.util.Scanner;

public class VowelsConsonants {

    public static String checkCharType(char ch) {
        char c = (ch >= 'A' && ch <= 'Z') ? (char)(ch + 32) : ch;
        if (c >= 'a' && c <= 'z') {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') return "Vowel";
            else return "Consonant";
        }
        return "Not a Letter";
    }

    public static String[][] findVowelsConsonants(String text) {
        int len = text.length();
        String[][] result = new String[len][2];
        for (int i = 0; i < len; i++) {
            char ch = text.charAt(i);
            result[i][0] = String.valueOf(ch);
            result[i][1] = checkCharType(ch);
        }
        return result;
    }

    public static void display(String[][] arr) {
        System.out.printf("%-10s %-15s\n", "Character", "Type");
        for (String[] row : arr) {
            System.out.printf("%-10s %-15s\n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[][] result = findVowelsConsonants(text);
        display(result);
    }
}
