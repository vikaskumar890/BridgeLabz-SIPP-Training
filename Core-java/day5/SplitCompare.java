import java.util.Scanner;

public class SplitCompare {

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

    public static String[] splitTextIntoWords(String text) {
        int len = stringLength(text);
        int spaceCount = 0;
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') spaceCount++;
        }

        int[] spaceIndices = new int[spaceCount];
        int index = 0;
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndices[index++] = i;
            }
        }

        String[] words = new String[spaceCount + 1];
        int start = 0;
        for (int i = 0; i < spaceCount; i++) {
            words[i] = substring(text, start, spaceIndices[i]);
            start = spaceIndices[i] + 1;
        }
        words[spaceCount] = substring(text, start, len);

        return words;
    }

    public static String substring(String s, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < end; i++) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = scanner.nextLine();

        String[] userSplit = splitTextIntoWords(text);
        String[] builtinSplit = text.split(" ");

        boolean result = compareArrays(userSplit, builtinSplit);

        System.out.println("User-defined split and built-in split are equal: " + result);

        scanner.close();
    }
}
