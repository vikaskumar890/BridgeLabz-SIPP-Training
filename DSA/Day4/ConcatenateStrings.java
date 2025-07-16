package DSA.Day4;
public class ConcatenateStrings {
    public static void main(String[] args) {
        String[] words = {"Java", "is", "a", "powerful", "language"};
        StringBuffer sb = new StringBuffer();

        for (String word : words) {
            sb.append(word);
        }

        System.out.println(sb.toString());
    }
} 