import java.util.Scanner;
class SmallestNumberInThree{
    public static void main(String[] args) {
		//creating object in scanner class for input
        Scanner input = new Scanner(System.in);
		
		//enter number1
        System.out.print("Enter the first number");
        int number1 = input.nextInt();
		
		//entering number 2
        System.out.print("Enter the second number: ");
        int number2 = input.nextInt();
		
		//entering number 3
        System.out.print("Enter the third number: ");
        int number3 = input.nextInt();
		
		//variable to check is first no smallest?
        boolean isFirstSmallest = (number1 < number2 && number1 < number3);
		
		//displaying result
        System.out.println("Is the first number the smallest? " + isFirstSmallest);
		
		//closing scanner class
		input.close();
    }
}
