import java.util.Scanner;

public class ArrayIndexOutOfBoundsDemo {

    public static void main(String[] args) {
		// Creating object of Scanner class
        Scanner scanner = new Scanner(System.in);

        // Taking user input for array size and elements
        System.out.print("Enter the number of names: ");
        int size = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        String[] names = new String[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
        }

        // Generate the exception
        System.out.println("\nGenerating ArrayIndexOutOfBoundsException:");
        try {
            generateException(names); // This will cause an ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }

        // Handle the exception
        System.out.println("\nHandling ArrayIndexOutOfBoundsException:");
        handleException(names); // This will handle the exception gracefully

        scanner.close();
    }

    // Method to generate ArrayIndexOutOfBoundsException
    public static void generateException(String[] array) {
        // Accessing an index beyond the length of the array
        System.out.println("Accessing invalid index: " + array[array.length]); // This will throw ArrayIndexOutOfBoundsException
    }

    // Method to handle ArrayIndexOutOfBoundsException
    public static void handleException(String[] array) {
        try {
            // Accessing an index beyond the length of the array
            System.out.println("Accessing invalid index: " + array[array.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handling ArrayIndexOutOfBoundsException
            System.out.println("Caught ArrayIndexOutOfBoundsException: Index is out of bounds for the array!");
        } catch (RuntimeException e) {
            // Handling other runtime exceptions
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }
}
