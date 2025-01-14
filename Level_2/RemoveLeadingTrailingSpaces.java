import java.util.*;

class RemoveLeadingTrailingSpaces {
    public static void main(String[] args) {
        // Create Scanner object to get user input
        Scanner sc = new Scanner(System.in);

        // Take a String as input from the user
        System.out.print("Enter a text: ");
        String text = sc.nextLine();
		
		// call a method to find starting and end index of String after removing extra spaces
		int [] trimIndices = toTrimSpaces(text);
		
		// call a method to produce substring after removing extra spaces
		String trimmedText = afterTrim(text, trimIndices[0], trimIndices[1]);
		
		// Trim using built-in method
        String trimmedUsingBuiltIn = text.trim();
		
		// call a method to check if in built and user defined methods are same
		boolean areEqual = compareMethods(trimmedText, trimmedUsingBuiltIn);
		
		 // Display results
        System.out.println("Original String: [" + text + "]");
        System.out.println("Trimmed using charAt(): [" + trimmedText + "]");
        System.out.println("Trimmed using built-in method: [" + trimmedUsingBuiltIn + "]");
        System.out.println("Are the results equal? " + areEqual);
    }

    // Method to find starting and end index of String after removing extra spaces
    public static int []  toTrimSpaces(String text) {
		int start = 0; 
		int end = text.length() - 1;
		
		// trim starting spaces
		while(start<=end && text.charAt(start) == ' '){
			start++;
		}
		
		// trim end spaces
		while(end>=start && text.charAt(end) == ' '){
			--end;
		}
		return new int [] {start , end}; // return array of starting and end index after removing extra spaces
    }
	
	// Method to produce substring after removing extra spaces
	public static String afterTrim(String text, int start , int end){
		StringBuilder modifiedString = new StringBuilder();
		for(int i = start; i<=end; i++){
			modifiedString.append(text.charAt(i));
		}
		return modifiedString.toString();
	}

    // Method to compare if output of built in method and manual method is same
    public static boolean compareMethods(String trimmedText, String trimmedUsingBuiltIn) {
        if(trimmedText.length() != trimmedUsingBuiltIn.length()){
			return false;
		}
		for(int i=0; i<trimmedText.length(); i++){
			if(trimmedText.charAt(i)!=trimmedUsingBuiltIn.charAt(i)){
				return false;
			}
		}
		return true;
    }
}