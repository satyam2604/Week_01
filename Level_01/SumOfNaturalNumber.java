import java.util.*;
class SumOfNaturalNumber{
	public static void main(String [] args){
		// Creating Scanner object
        Scanner sc = new Scanner(System.in);
		
		// Get integer input for number
		System.out.print("Enter the number: ");
        int n = sc.nextInt();
		
		//Display the sum n of natural number
		System.out.println("The sum of " + n + " natural number is " + sumOfNaturalNumber(n));
	}
	//method to retun sum of natural numbers
	public static long sumOfNaturalNumber(int n){
		
		int sum =0;
		while(n>0){
			sum+=n; // add to number to sum and derease it by 1 till it reaches 0
			--n;
		}
		return sum;
	}
}