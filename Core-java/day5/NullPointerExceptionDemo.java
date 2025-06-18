import java.util.Scanner;

public class NullPointerExceptionDemo {

    // Method to generate NullPointerException
    public static void generateException() {
        String text = null;
        // This will throw NullPointerException
        System.out.println("Length of text: " + text.length());
    }

    // Method to handle NullPointerException
    public static void handleException() {
        String text = null;
        try {
            System.out.println("Length of text: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("Exception caught: " + e);
        }
    }

    public static void main(String[] args) {
        // First call - uncommenting will cause program to stop abruptly
        // generateException();

        // Call method that handles exception gracefully
        handleException();
    }
}
