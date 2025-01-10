import java.util.Scanner;
class SpringSeason{
    public static void main(String[] args) {
		//creating scanner class object for input
        Scanner input = new Scanner(System.in);
		
		//enter month
        System.out.print("Enter the month: ");
        int month = input.nextInt();
		
		//enter day
        System.out.print("Enter the day: ");
        int day = input.nextInt();
		
		//checking condition with operators
        if ((month == 3 && day >= 20) || (month == 6 && day <= 20) || (month > 3 && month < 6)) {
			//display result
            System.out.println("It's a Spring Season");
        } else {
			//display result
            System.out.println("Not a Spring Season");
        }
		
		//closing scanner class
		input.close();
    }
}
