import java.util.*;

class FindLength {
    public static void main(String[] args) {
        // Create Scanner object to get user input
        Scanner sc = new Scanner(System.in);

        // Take a word as input from the user
        System.out.print("Enter a word: ");
        String word = sc.next();
		
		// call a method to find length of word by making a user defined method
		int textLength1 = findLength(word);
		int textLength2 = word.length();
		
		// print the word with its length which find using user defined method
		System.out.println("The word is: " + word + " with length: " + textLength1);
		
		// print if output of built in method and manual method is same
		if(isEquals(textLength1,textLength2)){
			System.out.println("Length of both method are similar.");
		}else{
			System.out.println("Length of both method are not similar.");
		}
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
    public static boolean isEquals(int textLength1 , int textLength2) {
        return textLength1 == textLength2;
    }
}
