import java.util.*;

class MeanHeight{
	public static void main(String [] args){
		// Creating Scanner object
		Scanner sc = new Scanner(System.in);
		
		//Defining size of an array
		double arr [] = new double[11];
		
		//Initialize sum variable
		double sum = 0.0;
		
		//Taking input from the user
		for(int i=0; i<arr.length; i++){
			System.out.print("Enter the height of " + (i+1) + " player: ");
			arr[i] = sc.nextDouble();
			sum += arr[i];
		}
		// Calcuate the mean height
		double mean = sum/11;
		
		//Display the mean height
		System.out.println(mean);
	}
}