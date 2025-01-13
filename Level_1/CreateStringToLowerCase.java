import java.util.*;

class CreateStringToLowerCase {
    public static void main(String[] args) {
        // Create Scanner object to get user input
        Scanner sc = new Scanner(System.in);

        // Take a sentence as input from the user
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
		
		// call a method to make a sentence to lower case by taking input from user
		String lowerCase1 = makeLowerCase(sentence);
		String lowerCase2 = sentence.toLowerCase();
		
		// Display array in char format craeted by manual method
		System.out.println("The sentence given by user: " + sentence);
		System.out.println("The sentence after applying user defined toLowerCase method: " + makeLowerCase(sentence));
		
		// print if output of built in method and manual method is same
		if(isEquals(lowerCase1,lowerCase2)){
			System.out.println("Both Strings are similar.");
		}else{
			System.out.println("Both Strings are not similar.");
		}
    }

    // Method to manually make sentence to Lower Case
    public static String makeLowerCase(String sentence) {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i<sentence.length(); i++){
			if((int)sentence.charAt(i)>= 65 && (int)sentence.charAt(i)<=90){
				sb.append((char)((int)sentence.charAt(i)+32));
			}else{
				sb.append(sentence.charAt(i));
			}
		}
		return sb.toString();
    }

    // Method to compare if output of built in method and manual method is same
    public static boolean isEquals(String lowerCase1, String lowerCase2) {
        return lowerCase1.equals(lowerCase2);
    }
}
