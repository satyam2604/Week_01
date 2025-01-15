import java.util.Scanner;

class CharacterFrequencyNestedLoops {

    public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Take input string from the user
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Call the method to find character frequencies
        String[] frequencies = findCharacterFrequencies(input);

        // Display the results
        System.out.println("Character frequencies:");
        for (String entry : frequencies) {
            if (entry != null) { // Avoid displaying null values
                System.out.println(entry);
            }
        }

        sc.close(); // Close Scanner
    }

    // Method to find the frequency of characters in a string
    public static String[] findCharacterFrequencies(String text) {
        char[] characters = text.toCharArray(); // Convert string to character array
        int[] frequency = new int[characters.length]; // Array to store frequencies

        // Outer loop to iterate through each character
        for (int i = 0; i < characters.length; i++) {
            if (characters[i] != '0') { // Skip already processed characters
                frequency[i] = 1; // Initialize frequency to 1

                // Inner loop to check for duplicate characters
                for (int j = i + 1; j < characters.length; j++) {
                    if (characters[i] == characters[j]) {
                        frequency[i]++;
                        characters[j] = '0'; // Mark duplicate characters as '0'
                    }
                }
            }
        }

        // Create a 1D array to store characters and their frequencies
        String[] result = new String[characters.length];
        int index = 0;

        // Store characters and their frequencies in the result array
        for (int i = 0; i < characters.length; i++) {
            if (characters[i] != '0') { // Skip marked characters
                result[index++] = "Character: " + characters[i] + ", Frequency: " + frequency[i];
            }
        }

        return result;
    }
}