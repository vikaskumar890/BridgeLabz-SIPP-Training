package DSA.Day4;
import java.io.*;

public class WordCountInFile {
    public static void main(String[] args) {
        String targetWord = "java";
        int count = 0;

        try (BufferedReader br = new BufferedReader(new FileReader("sample.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    if (word.equalsIgnoreCase(targetWord)) {
                        count++;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Occurrences of \"" + targetWord + "\": " + count);
    }
}
