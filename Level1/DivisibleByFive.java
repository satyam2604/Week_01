import java.util.Scanner;
class DivisibleByFive{
    public static void main(String[] args) {
		//creating object in scanner class for input
        Scanner input = new Scanner(System.in);
		
		//entering a number
        System.out.print("Enter a number ");
        int number = input.nextInt();
		
		// storing value in boolean to return true or false
        boolean isDivisible = (number % 5 == 0);
		
		// displaying the result
        System.out.println("Is the number " + number + " divisible by 5? " + isDivisible);
		
		//closing scanner class
		input.close();
    }
}
