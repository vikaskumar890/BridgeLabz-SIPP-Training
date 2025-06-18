import java.util.Scanner;

public class StringExceptionDemo {

    // Method to generate exception
    public static void generateStringIndexException(String input) {
        // This will cause the exception
        System.out.println("Accessing character at position " + input.length() + ": ");
        System.out.println(input.charAt(input.length()));  // Out of bounds
    }

    // Method to handle exception using try-catch
    public static void handleStringIndexException(String input) {
        try {
            System.out.println("Handled access at position " + input.length() + ": ");
            System.out.println(input.charAt(input.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception handled: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = sc.nextLine();

        // Generate and handle exception
        // Uncomment one at a time if needed
        // generateStringIndexException(userInput); // Will crash
        handleStringIndexException(userInput);      // Safe version
    }
}
