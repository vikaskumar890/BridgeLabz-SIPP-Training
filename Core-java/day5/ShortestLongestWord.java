import java.util.Scanner;

public class ShortestLongestWord {

    public static String[] splitWords(String text) {
        int count = 1;
        int len = text.length();
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') count++;
        }
        String[] words = new String[count];
        int wordStart = 0, wordIndex = 0;
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                words[wordIndex++] = text.substring(wordStart, i);
                wordStart = i + 1;
            }
        }
        words[wordIndex] = text.substring(wordStart);
        return words;
    }

    public static int stringLength(String s) {
        int length = 0;
        try {
            while(true) {
                s.charAt(length);
                length++;
            }
        } catch (Exception e) {}
        return length;
    }

    public static String[][] wordsWithLength(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(stringLength(words[i]));
        }
        return result;
    }

    public static int[] shortestLongest(String[][] wordsArr) {
        int minIndex = 0, maxIndex = 0;
        int minLen = Integer.parseInt(wordsArr[0][1]);
        int maxLen = minLen;
        for (int i = 1; i < wordsArr.length; i++) {
            int len = Integer.parseInt(wordsArr[i][1]);
            if (len < minLen) {
                minLen = len;
                minIndex = i;
            }
            if (len > maxLen) {
                maxLen = len;
                maxIndex = i;
            }
        }
        return new int[]{minIndex, maxIndex};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[] words = splitWords(text);
        String[][] wordsLen = wordsWithLength(words);
        int[] indices = shortestLongest(wordsLen);
        System.out.println("Shortest word: " + wordsLen[indices[0]][0] + " with length " + wordsLen[indices[0]][1]);
        System.out.println("Longest word: " + wordsLen[indices[1]][0] + " with length " + wordsLen[indices[1]][1]);
    }
}
