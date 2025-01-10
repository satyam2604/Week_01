import java.util.Scanner;
class Voting{
    public static void main(String[] args) {
		//creating scanner object for taking input
        Scanner input = new Scanner(System.in);
		
		//enter age
        System.out.print("Enter the person's age: ");
        int age = input.nextInt();
		
		//if age is above 18 you can vote
        if (age >= 18) {
			//display result
            System.out.println("The person's age is " + age + " and can vote.");
        } else {
			//display result
            System.out.println("The person's age is " + age + " and cannot vote.");
        }
		
		//closing scanner class
		input.close();
		
    }
}
