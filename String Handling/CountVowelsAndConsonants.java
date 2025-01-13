import java.util.*;

class CountVowelsAndConsonants{
	public static void main(String [] args){
		// Create Scanner object to get user input
        Scanner sc = new Scanner(System.in);
		
		// Take a String as a input from user
		System.out.print("Enter a word: ");
		String word = sc.next();
		
		// call a method store count of vowels and consonants
		int [] result = findVowelsAndConsonats(word.toLowerCase());
		
		// Display number of consonants and vowels
		System.out.println("The number of vowels in words are: " + result[0] + " and the number of consonants in words are: " + result[1] );
	}
	// Method to find number of vowels and consonants in word
	public static int[] findVowelsAndConsonats(String word){
		int countVowels = 0;
		int countConsonants = 0;
		for(int i=0; i<word.length(); i++){
			if(word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u' ){
				++countVowels; // if any letter is vowel then its count will increase
			}else{
				++countConsonants; // if any letter is consonant then its count will increase
			}
		}
		return new int[] {countVowels,countConsonants}; // return array of count of vowels and consonants
	}
}