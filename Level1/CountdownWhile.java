import java.util.Scanner;
class CountdownWhile {
    public static void main(String[] args) {
		//creating scanner class object for input
        Scanner input = new Scanner(System.in);
		//enter value
        System.out.print("Enter the countdown value: ");
        int counter = input.nextInt();
		
		//while loop in action
        while (counter > 0) {
			//display result
            System.out.println(counter);
            counter--;
        }
		
		//display result
        System.out.println("Launch!");
		
		//closing scanner class
		input.close();
		
    }
}
