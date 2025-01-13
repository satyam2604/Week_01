import java.util.Scanner;

public class NumberFormatExceptionDemo {

    public static void main(String[] args) {
		// Creating object of Scanner class
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a number as a string: ");
        String userInput = scanner.nextLine();

        // Generate the exception
        System.out.println("\nGenerating NumberFormatException:");
        try {
            generateException(userInput); // This will cause a NumberFormatException
        } catch (NumberFormatException e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }

        // Handle the exception
        System.out.println("\nHandling NumberFormatException:");
        handleException(userInput); // This will handle the exception gracefully

        scanner.close();
    }

    // Method to generate NumberFormatException
    public static void generateException(String input) {
        // Trying to parse a non-numeric string as an integer
        int number = Integer.parseInt(input); // This will throw NumberFormatException
        System.out.println("Converted number: " + number);
    }

    // Method to handle NumberFormatException
    public static void handleException(String input) {
        try {
            // Trying to parse a non-numeric string as an integer
            int number = Integer.parseInt(input);
            System.out.println("Converted number: " + number);
        } catch (NumberFormatException e) {
            // Handling NumberFormatException
            System.out.println("Caught NumberFormatException: Invalid input for parsing to a number!");
        } catch (RuntimeException e) {
            // Handling other runtime exceptions
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }
}
