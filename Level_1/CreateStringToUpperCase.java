import java.util.*;

class CreateStringToUpperCase {
    public static void main(String[] args) {
        // Create Scanner object to get user input
        Scanner sc = new Scanner(System.in);

        // Take a sentence as input from the user
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
		
		// call a method to make a sentence to uppercase by taking input from user
		String upperCase1 = makeUpperCase(sentence);
		String upperCase2 = sentence.toUpperCase();
		
		// Display array in char format craeted by manual method
		System.out.println("The sentence given by user: " + sentence);
		System.out.println("The sentence after applying user defined toUpperCase method: " + makeUpperCase(sentence));
		
		// print if output of built in method and manual method is same
		if(isEquals(upperCase1,upperCase2)){
			System.out.println("Both Strings are similar.");
		}else{
			System.out.println("Both Strings are not similar.");
		}
    }

    // Method to manually make sentence to Upper Case
    public static String makeUpperCase(String sentence) {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i<sentence.length(); i++){
			if((int)sentence.charAt(i)>= 97 && (int)sentence.charAt(i)<=122){
				sb.append((char)((int)sentence.charAt(i)-32));
			}else{
				sb.append(sentence.charAt(i));
			}
		}
		return sb.toString();
    }

    // Method to compare if output of built in method and manual method is same
    public static boolean isEquals(String upperCase1, String upperCase2) {
        return upperCase1.equals(upperCase2);
    }
}
