package DSA.Day4;
public class SearchWordInSentences {
    public static void main(String[] args) {
        String[] sentences = {
            "Java is powerful",
            "Python is popular",
            "C++ is fast",
            "JavaScript is versatile"
        };
        String word = "Python";
        String result = "Not Found";

        for (String sentence : sentences) {
            if (sentence.contains(word)) {
                result = sentence;
                break;
            }
        }

        System.out.println(result);
    }
}

