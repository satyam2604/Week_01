import java.util.*;

class ShortestLongestString {
    public static void main(String[] args) {
        // Create Scanner object to get user input
        Scanner sc = new Scanner(System.in);

        // Take a sentence as input from the user
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
		
		// call a method to find length of word by making a user defined method
		int textLength = findLength(sentence);
		
		// call a method to split words of sentence by making a user defined method
		String [] splitWord = splitSentence(sentence);
		
		// call a mthod which will return a 2D array with word and its length
		String [] [] wordWithLengths = findWordAndLength(splitWord);
		
		// call a method to find shortest and longest Strings
		String [] shortAndLong = findShortAndLong(splitWord);
		
		// Print shortest and longest String
		System.out.println("Shortest String is: " + shortAndLong[0]);
		System.out.println("Longest String is: " + shortAndLong[1]);
    }
	
	// Method to split text into words using charAt() method
    public static String[] splitSentence(String sentence) {
        StringBuilder word = new StringBuilder();
        ArrayList<String> wordsList = new ArrayList<>();

        for (int i = 0; i < findLength(sentence); i++) {
            char ch = sentence.charAt(i);
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

    // Method to find length of the word
    public static int findLength(String text) {
		char [] charArray = text.toCharArray(); // converts string to a character array
			int length = 0; // an variable which will store length of any text entered
		try{
			for(char ch : charArray){
			++length;	
			}
		}catch(RuntimeException ex){
			System.out.println("The code has thrown runtime exception: " + ex.getMessage()); //exception will be caught if any thrown
		}
		return length;
    }
	
	// Method to return a 2D array of words along with their length
	public static String [][] findWordAndLength(String [] splitWord){
		String[][] result = new String[splitWord.length][2];

        for (int i = 0; i < splitWord.length; i++) {
            result[i][0] = splitWord[i];
            result[i][1] = String.valueOf(findLength(splitWord[i])); // Convert length to String
        }

        return result;

	}
	
	// Method to find shortest and longest String
	public static String [] findShortAndLong(String [] splitWord){
		String shortest = splitWord[0];
		String longest = splitWord[0];
		for(String x: splitWord){
			if(longest.length()<x.length()){
				longest = x;
			}
			if(shortest.length()>x.length()){
				shortest = x;
			}
		}
		return new String [] {shortest, longest};
	}
}