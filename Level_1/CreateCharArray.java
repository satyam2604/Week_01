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
		
		// Display array in char format craeted by manual method
		for(char ch : charArray1){
			System.out.print(ch +" ");
		}
		//Clear a line
		System.out.println();
		
		// print if output of built in method and manual method is same
		if(isEquals(charArray1,charArray2)){
			System.out.println("Both arrays are similar.");
		}else{
			System.out.println("Both arrays are not similar.");
		}
    }

    // Method to manually make char array
    public static char[] makeCharArray(String word) {
		char [] charArray1 = new char[word.length()];
		for(int i=0; i<word.length(); i++){
			charArray1[i] = word.charAt(i);
		}
		return charArray1;
    }

    // Method to compare if output of built in method and manual method is same
    public static boolean isEquals(char [] charArray1, char [] charArray2) {
        if(charArray1.length != charArray2.length){
			return false;
		}
		for(int i=0; i<charArray1.length; i++){
			if(charArray1[i] != charArray2[i]){
				return false;
			}
		}
		return true;
    }
}
