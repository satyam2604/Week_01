import java.util.*;

class CountConsonantsVowels {
    public static void main(String[] args) {
        // Create Scanner object to get user input
        Scanner sc = new Scanner(System.in);

        // Take a text as input from the user
        System.out.print("Enter a word: ");
        String text = sc.nextLine();
		
		// call a method to convert text to lower case
		String modifiedText = toLowercase(text);
		
		// call a method to print count of vowels and consonants
		int [] result = countConsVowel(modifiedText);
		System.out.println("Count of vowels in String "+ text+ " is " + result[0]);
		System.out.println("Count of consonants in String "+ text+ " is " + result[1]);
    }

    // Method to count consonant And vowels
    public static int[] countConsVowel(String text) {
		int countVowel = 0;
		int countCons = 0;
		for(int i=0; i<text.length(); i++){
			if(Character.isAlphabetic(text.charAt(i))){
				if(text.charAt(i) == 'a' || text.charAt(i) == 'e' || text.charAt(i) == 'i' || text.charAt(i) == 'o' || text.charAt(i) == 'u'){
					++countVowel;;
				}else{
					++countCons;;
				}
			}
		}
		return new int [] {countVowel, countCons};
    }

    // Method to convert String in to lower case
    public static String toLowercase(String text) {
        StringBuilder sb = new StringBuilder();
		for(int i=0; i<text.length(); i++){
			if(text.charAt(i)>=65 && text.charAt(i)<=90){
				sb.append((char)((int)text.charAt(i)+32));
			}else{
				sb.append(text.charAt(i));
			}
		}
		return sb.toString();
    }
}
