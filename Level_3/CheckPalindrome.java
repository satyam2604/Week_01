import java.util.Scanner;

class CheckPalindrome {
    public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Take input string from the user
        System.out.print("Enter a string: ");
        String input = sc.nextLine().toLowerCase().trim(); // convert text in lowercase also remove extra spaces

        // Call the method to find if given input is palindrome or not
        // Check palindrome using the three logics
        boolean logic1 = isPalindromeLogic1(input);
        boolean logic2 = isPalindromeLogic2(input, 0, input.length() - 1);
        boolean logic3 = isPalindromeLogic3(input);

        // Display results
        System.out.println("Using Logic 1 (Two Pointer Comparison): " + (logic1 ? "Palindrome" : "Not a Palindrome"));
        System.out.println("Using Logic 2 (Recursion): " + (logic2 ? "Palindrome" : "Not a Palindrome"));
        System.out.println("Using Logic 3 (Character Array Reversal): " + (logic3 ? "Palindrome" : "Not a Palindrome"));

        sc.close(); // Close Scanner
    }

    // Method to check if given String is palindrome or not using two pointer comparision
    public static boolean isPalindromeLogic1(String text) {
		int start = 0;
		int end = text.length() - 1;
		while(start<end){
			if(text.charAt(start) != text.charAt(end)){
				return false;// not palindrome
			}
			start++;
			end--;
		}
		return true;
    }
	
	// Method to check if given String is palindrome or not using Recursion
    public static boolean isPalindromeLogic2(String text, int start, int end) {
		if(start>=end){
			return false; // return false if start index crosses base index 
		}
		if(text.charAt(start) != text.charAt(end)){
			return false; // return false if character does not match
		}
		return isPalindromeLogic2(text , start+1, end -1); // recursively call the function untill it recahes end
    }
	
	// Method to check if given String is palindrome or not using character array reversal
    public static boolean isPalindromeLogic3(String text) {
		char [] original = text.toCharArray();
		char [] reversed = reverseArray(original);
		
		for(int i=0; i<original.length; i++){
			if(original[i] != reversed[i]){
				return false;
			}
		}
		return true;
    }
	
	// Helper method to reverse a character array
    public static char[] reverseArray(char[] array) {
        char[] reversed = new char[array.length];
        for (int i = 0; i < array.length; i++) {
            reversed[i] = array[array.length - 1 - i];
        }
        return reversed;
    }
}