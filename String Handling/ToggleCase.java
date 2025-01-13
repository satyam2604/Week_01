import java.util.*;

class ToggleCase {
    public static void main(String[] args) {
        // Create Scanner object to get user input
        Scanner sc = new Scanner(System.in);

        // Take a Sentence as input from user
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        // Display the original Sentence
        System.out.println("The original Sentence is: " + sentence);

        // Print the sentence after toggling
        System.out.println("Sentence after toggling is: " + toggleCase(sentence));
    }

    // method to toggle cases in String
    public static String toggleCase(String sentence) {
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<sentence.length();i++){
			if((int)sentence.charAt(i)>=97 && (int)sentence.charAt(i)<=122){
				sb.append(Character.toUpperCase(sentence.charAt(i)));
			}else if((int)sentence.charAt(i)>=65 && (int)sentence.charAt(i)<=90){
				sb.append(Character.toLowerCase(sentence.charAt(i)));
			}else{
				sb.append(sentence.charAt(i));
			}
		}
		return sb.toString();
    }
}
