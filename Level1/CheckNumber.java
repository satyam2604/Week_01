import java.util.Scanner;
class CheckNumber{
    public static void main(String[] args) {
		//creating scanner class object for taking input
        Scanner input = new Scanner(System.in);
		
		//enter number
        System.out.print("Enter a number: ");
        int number = input.nextInt();
		
		//check no wiith resoect to 0
        if (number > 0) {
			//display result
            System.out.println("Positive");
        } else if (number < 0) {
			//display result
            System.out.println("Negative");
        } else {
			//display result
            System.out.println("Zero");
        }
		
		//closing scanner class
		input.close();
		
    }
}
