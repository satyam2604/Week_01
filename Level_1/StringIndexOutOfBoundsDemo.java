import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {

    public static void main(String[] args) {
		// Creating scanner object
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the string
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        // Generate the exception
        System.out.println("\nGenerating StringIndexOutOfBoundsException:");
        try {
            generateException(userInput); // This will cause a StringIndexOutOfBoundsException
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }

        // Handle the exception
        System.out.println("\nHandling StringIndexOutOfBoundsException:");
        handleException(userInput); // This will handle the exception gracefully

        scanner.close();
    }

    // Method to generate StringIndexOutOfBoundsException
    public static void generateException(String input) {
        // Accessing an index beyond the length of the string
        System.out.println("Character at index 100: " + input.charAt(100)); // This will throw StringIndexOutOfBoundsException
    }

    // Method to handle StringIndexOutOfBoundsException
    public static void handleException(String input) {
        try {
            // Accessing an index beyond the length of the string
            System.out.println("Character at index 100: " + input.charAt(100));
        } catch (StringIndexOutOfBoundsException e) {
            // Handling the exception
            System.out.println("Caught StringIndexOutOfBoundsException: Index out of bounds for the given string!");
        }
    }
}