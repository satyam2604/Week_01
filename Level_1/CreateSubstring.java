import java.util.*;

class CreateSubstring {
    public static void main(String[] args) {
        // Create Scanner object to get user input
        Scanner sc = new Scanner(System.in);

        // Take a word as input from the user
        System.out.print("Enter a word: ");
        String word = sc.next();
		
		// take starting index and end index from user also
		System.out.print("Enter staring index: ");
		int start = sc.nextInt();
		System.out.print("Enter a end index: ");
		int end = sc.nextInt();
		
		// call a method to make a substring by taking input from user
		String substring1 = makeSubstring(word, start, end);
		String substring2 = word.substring(start,end);
		
		// print if output of built in method and manual method is same
		if(isEquals(substring1,substring2)){
			System.out.println(substring1 + " and "+ substring2 + " are similar.");
		}else{
			System.out.println(substring1 + " and "+ substring2 + " are not similar.");
		}

    }

    // Method to manually make substring
    public static String makeSubstring(String word,int start, int end) {
		StringBuilder sb = new StringBuilder();
		for(int i = start; i< end; i++){
			sb.append(word.charAt(i));
		}
		return sb.toString();
    }

    // Method to compare if output of built in method and manual method is same
    public static boolean isEquals(String substring1, String substring2) {
        return substring1.equals(substring2); // Compare the results
    }
}
