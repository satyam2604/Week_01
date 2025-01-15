import java.util.Scanner;

class CharacterFrequency {
    public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Take input string from the user
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Call the method to find the frequency of characters
        String[][] frequencyResult = findCharacterFrequency(input);

        // Display the result
        System.out.println("Character frequencies: ");
        for (int i = 0; i < frequencyResult.length; i++) {
            if (frequencyResult[i][0] != null) { // To avoid displaying empty rows
                System.out.println(frequencyResult[i][0] + " : " + frequencyResult[i][1]);
            }
        }

        sc.close(); // Close Scanner
    }

    // Method to find the frequency of characters in a string
    public static String[][] findCharacterFrequency(String text) {
        int[] frequency = new int[256]; // Array to store frequency of ASCII characters

        // Loop through the text to calculate frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            frequency[currentChar]++; // Increment frequency of the character
        }

        // Create a 2D array to store characters and their frequencies
        String[][] result = new String[256][2]; // 256 for all ASCII characters
        int index = 0; // To track the result array index

        // Loop through the frequency array and store non-zero frequencies
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                result[index][0] = String.valueOf((char) i); // Character
                result[index][1] = String.valueOf(frequency[i]); // Frequency
                index++;
            }
        }

        // Resize the result array to remove unused rows
        String[][] finalResult = new String[index][2];
        for (int i = 0; i < index; i++) {
            finalResult[i][0] = result[i][0];
            finalResult[i][1] = result[i][1];
        }

        return finalResult; // Return the result array with characters and their frequencies
    }
}