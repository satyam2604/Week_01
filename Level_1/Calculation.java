import java.util.*;

class Calculation{
	public static void main(String [] args){
		// Creating Scanner object
		Scanner sc = new Scanner(System.in);
	
		//Defining size of an array
		int arr [] = new int[5];
		
		//Taking input in array from user
		for(int i=0; i<arr.length; i++){
			System.out.print("Enter "+ (i+1) +" number: ");
			arr[i] = sc.nextInt();
		}
		
		//check if number in array is positive or negative
		for(int i=0; i<arr.length; i++){
			if(arr[i]==0){
				System.out.println("The " + (i+1)+ " number is 0");
			}else if(arr[i]<0){
				System.out.println("The " + (i+1)+ " number is negative");
			}else{
				//check if number is even or odd
				if(arr[i]%2 ==0){
					System.out.println("The " + (i+1)+ " number is even");
				}else{
					System.out.println("The " + (i+1)+ " number is odd");
				}
			}
		}
		// comparing first and last element of the array
		if(arr[0]>arr[arr.length-1]){
			System.out.println("The first number is greater and last is smaller");
		}else if(arr[0]<arr[arr.length-1]){
			System.out.println("The last number is greater and first is smaller");
		}else{
			System.out.println("Both numbers are equal!!");
		}
	}
}