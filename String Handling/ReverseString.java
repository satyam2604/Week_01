import java.util.*;

class ReverseString{
	public static void main(String [] args){
		// Create Scanner object to get user input
        Scanner sc = new Scanner(System.in);
		
		// Take a String as a input from user
		System.out.print("Enter a word: ");
		String word = sc.next();
		
		//call a method to display reversed String
		System.out.println(" The String is: " + word + " and reversed is: " + isReversed(word)); 
	}
	
	// method to reverse a String
	public static String isReversed(String word){
		StringBuilder sb = new StringBuilder();
		for(int i=word.length() -1; i>=0; i--){
			sb.append(word.charAt(i));
		}
		return sb.toString();
	}
}