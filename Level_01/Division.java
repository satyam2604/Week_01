import java.util.*;

class Division{
	public static void main(String [] args){
		// Creating Scanner object
        Scanner sc = new Scanner(System.in);
		
		// Get integer input for number
		System.out.print("Enter the number: ");
        int number = sc.nextInt();
		
		// Get integer input for divisior
		System.out.print("Enter the divisior: ");
        int divisior = sc.nextInt();
		
		//Call method to find Quotient And Remainder
		int [] result = findRemainderAndQuotient(number,divisior);
		
		//Print the Quotient and Remainder
		System.out.println("The Quotient is: " + result[0]);
		System.out.println("The Remainder is: " + result[1]);
	}
	// Method to find Quotient And Remainder
	public static int[] findRemainderAndQuotient(int number,int divisior){
		int quotient = number / divisior;
		int remainder = number % divisior;
		return new int [] {quotient,remainder};
 	}
}