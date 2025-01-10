import java.util.Scanner;
class SumOfNaturalNumbers {
    public static void main(String[] args){
		//creating scanner class objects for taking input
        Scanner input = new Scanner(System.in);
		
		//enter a number
        System.out.print("Enter a number: ");
        int number = input.nextInt();
		
		//condition will follow if no>0 and then calculate sum of n natural number
        if (number > 0) {
            int sum = number * (number + 1) / 2;
			//display result
            System.out.println("The sum of " + number + " natural numbers is " + sum);
        } else {
			//display result
            System.out.println("The number " + number + " is not a natural number");
        }
		
		//closing scanner class
		input.close();
    }
}
