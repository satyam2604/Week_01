import java.util.*;

public class TextProcessor {

    public static void main(String[] args) {
		// Create Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        // Split the text into words
        String[] words = splitTextIntoWords(input);

        // Generate a 2D array with words and their lengths
        String[][] wordWithLengths = generateWordLengthArray(words);

        // Display the result
        System.out.println("\nWords and their lengths:");
        for (String[] row : wordWithLengths) {
            System.out.println("Word: " + row[0] + ", Length: " + row[1]);
        }

        scanner.close();
    }

    // Method to split text into words using charAt() method
    public static String[] splitTextIntoWords(String text) {
        StringBuilder word = new StringBuilder();
        ArrayList<String> wordsList = new ArrayList<>();

        for (int i = 0; i < getStringLength(text); i++) {
            char ch = text.charAt(i);
            if (ch == ' ') {
                if (word.length() > 0) {
                    wordsList.add(word.toString());
                    word.setLength(0); // Clear the word
                }
            } else {
                word.append(ch);
            }
        }

        // Add the last word if it exists
        if (word.length() > 0) {
            wordsList.add(word.toString());
        }

        // Convert ArrayList to array and return
        return wordsList.toArray(new String[0]);
    }

    // Method to find the length of a string without using length()
    public static int getStringLength(String str) {
        int length = 0;
        for (char ch : str.toCharArray()) {
            length++;
        }
        return length;
    }

    // Method to generate a 2D array with words and their lengths
    public static String[][] generateWordLengthArray(String[] words) {
        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getStringLength(words[i])); // Convert length to String
        }

        return result;
    }
}
