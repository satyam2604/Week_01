import java.util.Scanner;

public class IllegalArgumentExceptionDemo {
	/* An IllegalArgumentException occurs in Java when a method receives an argument
	that is inappropriate or illegal for the operation. For example, calling the substring(start, end) 
	method with start > end is invalid and throws this exception. */
    public static void main(String[] args) {
		
		//Creating object of Scanner class
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the string
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        // Generate the exception
        System.out.println("\nGenerating IllegalArgumentException:");
        try {
            generateException(userInput); // This will cause an IllegalArgumentException
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }

        // Handle the exception
        System.out.println("\nHandling IllegalArgumentException:");
        handleException(userInput); // This will handle the exception gracefully

        scanner.close();
    }

    // Method to generate IllegalArgumentException
    public static void generateException(String input) {
        // Using substring with an invalid range
        System.out.println("Substring: " + input.substring(5, 3)); // This will throw IllegalArgumentException
    }

    // Method to handle IllegalArgumentException
    public static void handleException(String input) {
        try {
            // Using substring with an invalid range
            System.out.println("Substring: " + input.substring(5, 3));
        } catch (IllegalArgumentException e) {
            // Handling IllegalArgumentException
            System.out.println("Caught IllegalArgumentException: Start index cannot be greater than the end index!");
        } catch (RuntimeException e) {
            // Handling other runtime exceptions
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }
}
