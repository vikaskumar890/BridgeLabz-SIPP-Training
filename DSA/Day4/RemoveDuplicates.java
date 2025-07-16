package DSA.Day4;
import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String input = "programming";
        StringBuilder sb = new StringBuilder();
        HashSet<Character> seen = new HashSet<>();

        for (char c : input.toCharArray()) {
            if (!seen.contains(c)) {
                seen.add(c);
                sb.append(c);
            }
        }

        System.out.println(sb.toString());
    }
}

