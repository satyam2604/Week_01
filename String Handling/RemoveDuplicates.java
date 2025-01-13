import java.util.*;

class RemoveDuplicates {
	public static void main(String [] args){
		// Create Scanner object to get user input
        Scanner sc = new Scanner(System.in);
		
		// Take a String as a input from user
		System.out.print("Enter a word: ");
		String word = sc.next().toLowerCase();
		
		// Display the original String 
		System.out.println("The original String is: " + word);
		
		// String after removing duplicates
		System.out.println("String after removing duplicates is: " + duplicatesRemoved(word));
	}
	
	// method to remove duplicates
	public static String duplicatesRemoved(String word){
		Set<Character> set = new LinkedHashSet<>(); // set does not store duplicates
		for(int i=0; i<word.length(); i++){
			set.add(word.charAt(i));
		}
		StringBuilder sb = new StringBuilder();
		for(char ch : set){
			sb.append(ch);
		}
		return sb.toString();
	}
}