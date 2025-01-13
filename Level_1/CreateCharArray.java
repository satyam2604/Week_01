import java.util.*;

class CreateCharArray {
    public static void main(String[] args) {
        // Create Scanner object to get user input
        Scanner sc = new Scanner(System.in);

        // Take a word as input from the user
        System.out.print("Enter a word: ");
        String word = sc.next();
		
		// call a method to make a substring by taking input from user
		char [] charArray1 = makeCharArray(word);
		char [] charArray2 = word.toCharArray();
		
		// print if output of built in method and manual method is same
		if(isEquals(substring1,substring2)){
			System.out.println(substring1 + " and "+ substring2 + " are similar.");
		}else{
			System.out.println(substring1 + " and "+ substring2 + " are not similar.");
		}

    }

    // Method to manually make substring
    public static char[] makeCharArray(String word) {
		char [] charArray1 = new char[word.length() -1);
    }

    // Method to compare if output of built in method and manual method is same
    public static boolean isEquals(String substring1, String substring2) {
        return substring1.equals(substring2); // Compare the results
    }
}
