import java.util.*;

class NumberCheck{
	public static void main(String [] args){
		// Creating Scanner object
        Scanner sc = new Scanner(System.in);
		
		// Get integer input for number
		System.out.print("Enter the number: ");
        int n = sc.nextInt();

		// Display the given number is positive, negative or zero
		System.out.print("Entered number is: " + numberCheck(n));
	}
	
	public static int numberCheck(int n){
		if(n>0){
			return 1; // return 1 if number is positive
		}else if(n<0){
			return -1; // return -1 if number is negative
		}
		return 0; // return 0 if number is 0
	}
}