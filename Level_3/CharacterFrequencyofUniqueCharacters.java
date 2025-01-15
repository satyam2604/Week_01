import java.util.Scanner;

class CharacterFrequencyofUniqueCharacters {

    public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Take input string from the user
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Call the method to find unique characters
        char[] uniqueChars = findUniqueCharacters(input);

        // Call the method to find frequencies
        String[][] frequencies = findCharacterFrequencies(input, uniqueChars);

        // Display the results
        System.out.println("Character frequencies:");
        for (String[] entry : frequencies) {
            System.out.println("Character: " + entry[0] + ", Frequency: " + entry[1]);
        }

        sc.close(); // Close Scanner
    }

    // Method to find unique characters in a string
    public static char[] findUniqueCharacters(String text) {
        int length = text.length(); // Get the length of the string
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

    // Method to find the frequency of characters in a string
    public static String[][] findCharacterFrequencies(String text, char[] uniqueChars) {
        int[] frequency = new int[256]; // Array to store the frequency of characters

        // Loop through the text to calculate frequencies
        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }

        // Create a 2D array to store unique characters and their frequencies
        String[][] result = new String[uniqueChars.length][2];

        // Loop through the unique characters and store their frequencies
        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = String.valueOf(uniqueChars[i]);
            result[i][1] = String.valueOf(frequency[uniqueChars[i]]);
        }

        return result;
    }
}