import java.util.*;

class Factors{
	public static void main(String [] args){
		//Creating Scanner object
		Scanner sc = new Scanner(System.in);
		
		// Taking user input as an number
		System.out.print("Enter the element to find its factors: ");
		int number = sc.nextInt();
		
		//initialize maxFactor
		int maxFactor = 10;
		
		// initialize array of maxFactor
		int factors [] = new int[maxFactor];
		
		//current index to store factors
		int index = 0;
		
		for(int i=1; i<=number; i++){
			if(number % i == 0){
				if(index == maxFactor){
					maxFactor*=2; //if capacity of array of factors is reached then double it
					int temp [] = new int[maxFactor];
					for (int j = 0; j < factors.length; j++) {
                        temp[j] = factors[j];
                    }
					//Assign the resized array
                    factors = temp;
				}
				//Add a factor to a array
				    factors[index++] = i;
			}
		}
		// Display the factors
        System.out.println("Factors of " + number + " are:");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
	}
}