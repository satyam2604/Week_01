import java.util.*;

class Palindrome {
	public static void main(String [] args){
		// Create Scanner object to get user input
        Scanner sc = new Scanner(System.in);
		
		// Take a String as a input from user
		System.out.print("Enter a word: ");
		String word = sc.next().toLowerCase();
		
		// a variable to Store reversed word
		String reversed = isReversed(word);
		
		//call a method to display reversed String
		System.out.println("The String is: " + word + " and reversed is: " + reversed);
		
		// Display String is palindrome or nor 
		if(isPalindrome(word,reversed)){
			System.out.println("String "+ word + " is Palindrome");
		}else{
			System.out.println("String "+ word + " is Palindrome");
		}
	}
	
	// method to reverse a String
	public static String isReversed(String word){
		StringBuilder sb = new StringBuilder();
		for(int i=word.length() -1; i>=0; i--){
			sb.append(word.charAt(i));
		}
		return sb.toString();
	}
	
	public static boolean isPalindrome(String word, String reversed){
		return word.equalsIgnoreCase(reversed);
	}
}