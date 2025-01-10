import java.util.*;

class Voting{
	public static void main(String [] args){
		//Creating Scanner object
		Scanner sc = new Scanner(System.in);
	
		//Defining an array of size 10
		int arr [] = new int[10];
	
		//Taking input from user in array
		for(int i=0; i<10; i++){
			System.out.print("Enter "+ (i+1)+ " number.");
			arr[i] = sc.nextInt();
		}
		
		// Defining if they are able to vote or not
		for(int i=0; i<arr.length; i++){
			if(arr[i]>=18){
				System.out.println("The student with the age "+ arr[i] + " can vote.");
			}else if(arr[i]<18 && arr[i]>0){
				System.out.println("The student with the age "+ arr[i] + " can not vote.");
			}else if(arr[i]<0){
				System.out.println("Invalid age!!");
			}
		}
	}
}