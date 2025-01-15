import java.util.Scanner;

class DisplayCalendar {
    public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Take input for month and year
        System.out.print("Enter the month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter the year: ");
        int year = sc.nextInt();

        // Display the calendar
        displayCalendar(month, year);

        sc.close(); // Close Scanner
    }

    // Method to display the calendar
    public static void displayCalendar(int month, int year) {
        // Get the name of the month and the number of days in the month
        String monthName = getMonthName(month);
        int daysInMonth = getDaysInMonth(month, year);

        // Get the first day of the month
        int firstDay = getFirstDayOfMonth(month, year);

        // Print the header of the calendar
        System.out.println("\n  " + monthName + " " + year);
        System.out.println("  Sun  Mon  Tue  Wed  Thu  Fri  Sat");

        // Print initial spaces for the first day
        for (int i = 0; i < firstDay; i++) {
            System.out.print("     ");
        }

        // Print the days of the month
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%5d", day); // Print the day with proper spacing
            if ((firstDay + day) % 7 == 0) { // Move to the next line after Saturday
                System.out.println();
            }
        }
        System.out.println();
    }

    // Method to get the name of the month
    public static String getMonthName(int month) {
        String[] months = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };
        return months[month - 1];
    }

    // Method to get the number of days in the month
    public static int getDaysInMonth(int month, int year) {
        int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        // Check for February and Leap Year
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return days[month - 1];
    }

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Method to get the first day of the month
    public static int getFirstDayOfMonth(int month, int year) {
        int y = year - (14 - month) / 12;
        int x = y + y / 4 - y / 100 + y / 400;
        int m = month + 12 * ((14 - month) / 12) - 2;
        return (1 + x + (31 * m) / 12) % 7; // Return the day of the week (0=Sun, 1=Mon, ..., 6=Sat)
    }
}
