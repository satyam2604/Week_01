import java.util.*;

class LongestWord {
    public static void main(String[] args) {
        // Create Scanner object to get user input
        Scanner sc = new Scanner(System.in);

        // Take a Sentence as input from user
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        // Display the original Sentence
        System.out.println("The original Sentence is: " + sentence);

        // Display longest word in sentence
        System.out.println("Longest Word in sentence is: " + longestWord(sentence));
    }

    // method to find longest word in sentence
    public static String longestWord(String sentence) {
        String[] words = sentence.split("\\s+"); // split by whitespace
        int maxLength = 0;
        String longestWord = "";

        for (String word : words) {
            if (word.length() > maxLength) {
                maxLength = word.length();
                longestWord = word;
            }
        }

        return longestWord;
    }
}
