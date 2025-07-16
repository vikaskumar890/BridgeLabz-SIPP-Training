package DSA.Day4;
import java.io.*;

public class CombinedChallenge {
    public static void main(String[] args) {
        int n = 1000000;

        long sbStart = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append("hello");
        }
        long sbEnd = System.nanoTime();
        System.out.println("StringBuilder time: " + (sbEnd - sbStart) + " ns");

        long bufferStart = System.nanoTime();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < n; i++) {
            stringBuffer.append("hello");
        }
        long bufferEnd = System.nanoTime();
        System.out.println("StringBuffer time: " + (bufferEnd - bufferStart) + " ns");

        long readerStart = System.nanoTime();
        int wordCount1 = 0;
        try (BufferedReader fr = new BufferedReader(new FileReader("largefile.txt"))) {
            String line;
            while ((line = fr.readLine()) != null) {
                wordCount1 += line.split("\\s+").length;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        long readerEnd = System.nanoTime();
        System.out.println("FileReader word count: " + wordCount1);
        System.out.println("FileReader time: " + (readerEnd - readerStart) + " ns");

        long streamStart = System.nanoTime();
        int wordCount2 = 0;
        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(new FileInputStream("largefile.txt"), "UTF-8"))) {
            String line;
            while ((line = br.readLine()) != null) {
                wordCount2 += line.split("\\s+").length;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        long streamEnd = System.nanoTime();
        System.out.println("InputStreamReader word count: " + wordCount2);
        System.out.println("InputStreamReader time: " + (streamEnd - streamStart) + " ns");
    }
}

