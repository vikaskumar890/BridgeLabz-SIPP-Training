import java.util.Scanner;

public class IllegalArgumentExceptionDemo {

    // Method to generate IllegalArgumentException
    public static void generateException(String str) {
        // This will throw IllegalArgumentException because startIndex > endIndex
        System.out.println("Substring: " + str.substring(5, 2));
    }

    // Method to handle IllegalArgumentException
    public static void handleException(String str) {
        try {
            System.out.println("Substring: " + str.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught: " + e);
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Uncommenting next line will cause abrupt stop due to exception
        // generateException(input);

        // Calling the handler method to catch the exception
        handleException(input);

        scanner.close();
    }
}
