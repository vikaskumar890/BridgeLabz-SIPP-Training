public class PalindromeChecker {

    private String text;

    public PalindromeChecker(String text) {
        this.text = text;
    }

    public boolean isPalindrome() {
        String reversed = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed += text.charAt(i);
        }
        return text.equalsIgnoreCase(reversed);
    }

    public void displayResult() {
        System.out.println("Text: " + text);
        if (isPalindrome()) {
            System.out.println("The text is a palindrome.");
        } else {
            System.out.println("The text is NOT a palindrome.");
        }
    }

    public static void main(String[] args) {
        PalindromeChecker checker1 = new PalindromeChecker("madam");
        PalindromeChecker checker2 = new PalindromeChecker("hello");

        System.out.println("=== Check 1 ===");
        checker1.displayResult();

        System.out.println("\n=== Check 2 ===");
        checker2.displayResult();
    }
}
