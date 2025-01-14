import java.util.*;

class WordAndLengthIn2DArray {
    public static void main(String[] args) {
        // Create Scanner object to get user input
        Scanner sc = new Scanner(System.in);

        // Take a sentence as input from the user
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
		
		// call a method to find length of word by making a user defined method
		int textLength = findLength(sentence);
		
		// call a method to split words of sentence by making a user defined method
		String [] splitWord1 = splitSentence(sentence);
		String [] splitWord2 = sentence.split("\\s");
		
		// print the sentence after splitting using user defined method
		for(String str: splitWord1){
		System.out.println(str);			
		}
		
		// print if output of built in method and manual method is same
		if(isEquals(splitWord1,splitWord2)){
			System.out.println("Both method are similar.");
		}else{
			System.out.println("Both method are not similar.");
		}
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
    public static int findLength(String word) {
		char [] charArray = word.toCharArray(); // converts string to a character array
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

    // Method to compare if output of built in method and manual method is same
    public static boolean isEquals(String [] splitWord1, String [] splitWord2) {
        if(splitWord1.length != splitWord2.length){
			return false;
		}
		for(int i=0; i<splitWord1.length; i++){
			if(!splitWord1.equals(splitWord2)){
				return false;
			}
		}
		return true;
    }
}
