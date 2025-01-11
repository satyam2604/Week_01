import java.util.*;

class ChocolateDistribution{
	public static void main(String [] args){
		// Creating Scanner object
        Scanner sc = new Scanner(System.in);
		
		// Get integer input for number of chocolates
		System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = sc.nextInt();
		
		// Get integer input for number of Childrens
		System.out.print("Enter the number of Childrens: ");
        int numberOfChildrens = sc.nextInt();
		
		//Call method to find Quotient And Remainder
		int [] result = findRemainderAndQuotient(numberOfChocolates,numberOfChildrens);
		
		//Print the Quotient and Remainder
		System.out.println("The number of chocolate each child will get: " + result[0]);
		System.out.println("Remaining number of chocolates: " + result[1]);
	}
	// Method to find Quotient And Remainder
	public static int[] findRemainderAndQuotient(int number,int divisior){
		int quotient = number / divisior;
		int remainder = number % divisior;
		return new int [] {quotient,remainder};
 	}
}