import java.util.Scanner;

class SpringSeason {
    public static void main(String[] args) {
        // Creating Scanner object for user input
        Scanner sc = new Scanner(System.in);
        
        // Taking month and day as input from the user
        System.out.print("Enter the month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter the day (1-31): ");
        int day = sc.nextInt();
        
        // Check if the input date is within the Spring season
        if (isSpringSeason(month, day)) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
    
    // Method to check if the date is within the Spring season (March 20 - June 20)
    public static boolean isSpringSeason(int month, int day) {
        // Checking the range for Spring Season: March 20 (3, 20) to June 20 (6, 20)
        if (month > 3 && month < 6) {
            return true; // Any day in March 21 - May 31 is Spring Season
        } else if (month == 3 && day >= 20) {
            return true; // From March 20 onward
        } else if (month == 6 && day <= 20) {
            return true; // Until June 20
        }
        return false; // Any other date is not within Spring Season
    }
}
