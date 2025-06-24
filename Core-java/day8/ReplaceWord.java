import java.util.Scanner;

public class ReplaceWord {

    public static String replaceWord(String sentence, String oldWord, String newWord) {
        String[] words = sentence.split(" ");
        String result = "";

        for (String word : words) {
            if (word.equals(oldWord)) {
                result += newWord + " ";
            } else {
                result += word + " ";
            }
        }

        return result.trim();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the sentence: ");
        String sentence = scanner.nextLine();

        System.out.print("Enter the word to replace: ");
        String oldWord = scanner.nextLine();

        System.out.print("Enter the new word: ");
        String newWord = scanner.nextLine();

        String updatedSentence = replaceWord(sentence, oldWord, newWord);
        System.out.println("Updated Sentence: " + updatedSentence);
    }
}
