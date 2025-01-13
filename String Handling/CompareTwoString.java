import java.util.*;

class CompareTwoString {
    public static void main(String[] args) {
        // Create Scanner object to get user input
        Scanner sc = new Scanner(System.in);

        // Take a word as input from user
        System.out.print("Enter a first word: ");
        String word1 = sc.next().toLowerCase();
		
		// Take a word as input from user
        System.out.print("Enter a second word: ");
        String word2 = sc.next().toLowerCase();
		
		// call a method to find words in lexicographical order
		String [] result = inLexicographical(word1 ,word2);

        // Print words in lexicographical order
        System.out.println(result[0] + " comes before " + result[1] + " in lexicographical order.");
    }

    // method to arrange words in lexicographical order
    public static String [] inLexicographical(String word1, String word2) {
		String [] result = new String[2];
		for(int i=0; i<word1.length() && i< word2.length(); i++){
			if((int)word1.charAt(i) == (int)word2.charAt(i)){
				continue;
			}else if((int)word1.charAt(i) >= (int)word2.charAt(i)){
				result[0] = word2;
				result[1] = word1;
			}else{
				result[0] = word1;
				result[1] = word2;
			}
		}
		return result;
    }
}
