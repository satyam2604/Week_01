import java.util.*;

class CompareEquals {
    public static void main(String[] args) {
        // Create Scanner object to get user input
        Scanner sc = new Scanner(System.in);

        // Take a word as input from the user
        System.out.print("Enter first word: ");
        String word1 = sc.next();
        
        // Take a word as input from the user
        System.out.print("Enter second word: ");
        String word2 = sc.next();

        // Print if the two words are equal or not using the manual method
        if (isEqual(word1, word2)) {
            System.out.println(word1 + " and " + word2 + " are similar");
        } else {
            System.out.println(word1 + " and " + word2 + " are not similar");
        }

        // Print if the built-in and manual method output is similar
        if (isMethodEqual(word1, word2)) {
            System.out.println("Both method are similar");
        } else {
            System.out.println("Both method are not similar");
        }
    }

    // Method to manually check if two words are equal
    public static boolean isEqual(String word1, String word2) {
		if(word1.length() != word2.length()){
			return false;
		}
		for(int i=0; i<word1.length(); i++){
			if(word1.charAt(i) != word2.charAt(i)){
				return false;
			}
		}
		return true;
    }

    // Method to compare if manual method and built-in equals() output match
    public static boolean isMethodEqual(String word1, String word2) {
        return isEqual(word1, word2) == word1.equals(word2); // Compare the results
    }
}
