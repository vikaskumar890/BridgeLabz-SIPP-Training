import java.util.Scanner;

public class StringLengthWithoutLength {

    public static int findLength(String s) {
        int count = 0;
        try {
            while(true) {
                s.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int lengthCustom = findLength(input);
        int lengthBuiltIn = input.length();
        System.out.println("Length found by custom method: " + lengthCustom);
        System.out.println("Length found by built-in method: " + lengthBuiltIn);
    }
}
