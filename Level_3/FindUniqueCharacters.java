import java.util.Scanner;

class FindUniqueCharacters {
    public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Take input string from the user
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Call the method to find unique characters
        char[] uniqueChars = findUniqueCharacters(input);

        // Display the result
        System.out.print("Unique characters: ");
        for (char c : uniqueChars) {
            if (c != '\0') { // Avoid displaying unused elements in the array
                System.out.print(c + " ");
            }
        }

        sc.close(); // Close Scanner
    }

    // Method to calculate the length of a string without using length() method
    public static int calculateLength(String text) {
        int length = 0;
        try {
            while (true) {
                text.charAt(length); // Try to access characters until exception occurs
                length++;
            }
        } catch (IndexOutOfBoundsException e) {
            // When exception occurs, we know we've reached the end of the string
        }
        return length;
    }

    // Method to find unique characters in a string
    public static char[] findUniqueCharacters(String text) {
        int length = calculateLength(text); // Calculate the length of the string
        char[] unique = new char[length]; // Array to store unique characters
        int index = 0; // Index for the unique array

        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            // Check if the current character is unique
            for (int j = 0; j < i; j++) {
                if (currentChar == text.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }

            // If unique, add to the unique array
            if (isUnique) {
                unique[index++] = currentChar;
            }
        }

        // Resize the array to include only unique characters
        char[] result = new char[index];
        for (int i = 0; i < index; i++) {
            result[i] = unique[i];
        }

        return result;
    }
}