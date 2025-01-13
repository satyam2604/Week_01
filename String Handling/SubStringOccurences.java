import java.util.*;

class SubStringOccurences {
    public static void main(String[] args) {
        // Create Scanner object to get user input
        Scanner sc = new Scanner(System.in);

        // Take a Sentence as input from user
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
		
		// Take a word from user to find in sentence
        System.out.print("Enter a word to find its occurence in String: ");
        String subString = sc.nextLine();

        // Display the original Sentence
        System.out.println("The original Sentence is: " + sentence);

        // Display longest word in sentence
        System.out.println("Occurence of Word in sentence is: " + occurenceOf(sentence,subString));
    }

    // method to find occurence of word in sentence
    public static int occurenceOf(String sentence, String substring) {
		int count = 0;
		int fromIndex = 0;
		
       while ((fromIndex = sentence.indexOf(substring, fromIndex)) != -1) {
                count++;
                fromIndex += substring.length();
            }
			return count;
    }
}
