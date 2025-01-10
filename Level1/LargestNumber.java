import java.util.Scanner;
class LargestNumber {
    public static void main(String[] args) {
		//creating object in scanner class for input
        Scanner input = new Scanner(System.in);
		
		//enter number 1
        System.out.print("Enter the first number: ");
        int number1 = input.nextInt();
		
		//enter number 2
        System.out.print("Enter the second number: ");
        int number2 = input.nextInt();
		
		//enter number 3
        System.out.print("Enter the third number: ");
        int number3 = input.nextInt();
		
		//varible to check if number 1 is largest
        boolean isFirstLargest = (number1 > number2 && number1 > number3);
		
		//variable to check if number2 is largest
        boolean isSecondLargest = (number2 > number1 && number2 > number3);
		
		//variable to check if number is largest
        boolean isThirdLargest = (number3 > number1 && number3 > number2);
		
		//displaying result accordingly
        System.out.println("Is the first number the largest? " + isFirstLargest);
        System.out.println("Is the second number the largest? " + isSecondLargest);
        System.out.println("Is the third number the largest? " + isThirdLargest);
		
		//closing scanner class
		input.close();
    }
}
