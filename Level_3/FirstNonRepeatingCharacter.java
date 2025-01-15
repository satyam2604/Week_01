import java.util.Scanner;

class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Take input string from the user
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Call the method to find the first non-repeating character
        char result = findFirstNonRepeatingCharacter(input);

        // Display the result
        if (result != '\0') {
            System.out.println("The first non-repeating character is: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }

        sc.close(); // Close Scanner
    }

    // Method to find the first non-repeating character in a string
    public static char findFirstNonRepeatingCharacter(String text) {
        int[] frequency = new int[256]; // Array to store frequency of ASCII characters

        // Loop through the text to calculate frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            frequency[currentChar]++; // Increment frequency of the character
        }

        // Loop through the text to find the first character with frequency 1
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (frequency[currentChar] == 1) {
                return currentChar; // Return the first non-repeating character
            }
        }

        return '\0'; // Return null character if no non-repeating character is found
    }
}
