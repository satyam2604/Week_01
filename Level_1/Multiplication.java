import java.util.*;

class Multiplication{
	public static void main(String [] args){
		// Creating Scanner object
		Scanner sc = new Scanner(System.in);
		
		//Defining size of an array
		int arr [] = new int[10];
		
		//Taking input from the user
		System.out.print("Enter the number: ");
		int number = sc.nextInt();
		
		//Storing multiplication of number in array
		for(int i=0; i<10; i++){
			arr[i] = number * (i+1);
			// Display the multiplication table
			System.out .println(number+" * "+ (i+1) + " = "+ arr[i]);
		}
	}
}