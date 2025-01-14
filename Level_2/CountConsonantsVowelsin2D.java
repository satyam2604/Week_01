import java.util.*;

class CountConsonantsVowelsin2D {
    public static void main(String[] args) {
        // Create Scanner object to get user input
        Scanner sc = new Scanner(System.in);

        // Take a text as input from the user
        System.out.print("Enter a word: ");
        String text = sc.nextLine();
		
		// call a method to convert text to lower case
		String modifiedText = toLowercase(text);
		
		// call a method to print count and String of vowels and consonants  
		String [] [] consAndVowels = countConsAndVowels(modifiedText);
		
		// print String of consonants and vowels with count
		System.out.println("String of consonants and vowels with count");
        for (String[] row : consAndVowels) {
            System.out.println("String: " + row[0] + ", count: " + row[1]);
        }
    }

    // Method to count consonant And vowels and make a String of consonants and vowels
    public static String [][] countConsAndVowels(String text) {
		int countVowel = 0;
		StringBuilder vowels = new StringBuilder();
		StringBuilder cons = new StringBuilder();
		int countCons = 0;
		for(int i=0; i<text.length(); i++){
			if(Character.isAlphabetic(text.charAt(i))){
				if(text.charAt(i) == 'a' || text.charAt(i) == 'e' || text.charAt(i) == 'i' || text.charAt(i) == 'o' || text.charAt(i) == 'u'){
					++countVowel;
					vowels.append(text.charAt(i));
				}else{
					++countCons;
					cons.append(text.charAt(i));
				}
			}
		}
		 String[][] consAndVowels = new String[2][];
		consAndVowels[0] = new String[]{vowels.toString(), Integer.toString(countVowel)};
		consAndVowels[1] = new String[]{cons.toString(), Integer.toString(countCons)};

    return consAndVowels;
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
