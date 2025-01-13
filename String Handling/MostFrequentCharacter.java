import java.util.*;

class MostFrequentCharacter {
    public static void main(String[] args) {
        // Create Scanner object to get user input
        Scanner sc = new Scanner(System.in);

        // Take a word as input from user
        System.out.print("Enter a word: ");
        String word = sc.next().toLowerCase();

        // Print the most frequent character from a word
        System.out.println("The most frequent character from word "+ word + " is: "+ isFrequent(word));
    }

    // method to print the most frequent character from a word
    public static char isFrequent(String word) {
		
    }
}
