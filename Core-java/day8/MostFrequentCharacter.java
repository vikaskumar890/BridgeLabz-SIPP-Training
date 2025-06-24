import java.util.Scanner;

public class MostFrequentCharacter {

    public static char mostFrequentCharacter(String input) {
        int[] freq = new int[256];
        for (char ch : input.toCharArray()) {
            freq[ch]++;
        }

        int max = 0;
        char result = ' ';
        for (char ch : input.toCharArray()) {
            if (freq[ch] > max) {
                max = freq[ch];
                result = ch;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        char mostFrequent = mostFrequentCharacter(input);
        System.out.println("Most Frequent Character: " + mostFrequent);
    }
}
