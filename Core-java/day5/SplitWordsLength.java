import java.util.Scanner;

public class SplitWordsLength {

    public static String[] splitTextIntoWords(String text) {
        int wordCount = 1;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') wordCount++;
        }

        String[] words = new String[wordCount];
        int wordIndex = 0, start = 0;

        for (int i = 0; i <= text.length(); i++) {
            if (i == text.length() || text.charAt(i) == ' ') {
                words[wordIndex++] = substring(text, start, i);
                start = i + 1;
            }
        }
        return words;
    }

    public static int stringLength(String s) {
        int len = 0;
        try {
            while(true) {
                s.charAt(len);
                len++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return len;
        }
    }

    public static String substring(String s, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < end; i++) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    public static String[][] wordsAndLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(stringLength(words[i]));
        }
        return result;
    }

    public static void display(String[][] data) {
        System.out.printf("%-15s%-10s\n", "Word", "Length");
        for (String[] row : data) {
            System.out.printf("%-15s%-10s\n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String input = scanner.nextLine();

        String[] words = splitTextIntoWords(input);
        String[][] wordLengths = wordsAndLengths(words);
        display(wordLengths);

        scanner.close();
    }
}
