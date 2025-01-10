import java.util.*;

class FizzBuzz {
    public static void main(String[] args) {
        // Creating Scanner object
        Scanner sc = new Scanner(System.in);

        // Take a number as input
        System.out.print("Enter a positive number: ");
        int number = sc.nextInt();

        // If the number is negative or 0, terminate the program
        if (number <= 0) {
            System.out.println("Please enter a positive number.");
            return; // Exit the program gracefully
        }

        // Creating a String array
        String[] results = new String[number];

        // Use a for loop from 1 to the number to calculate FizzBuzz
        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                results[i - 1] = "FizzBuzz"; // Divisible by both 3 and 5
            } else if (i % 3 == 0) {
                results[i - 1] = "Fizz"; // Divisible by 3
            } else if (i % 5 == 0) {
                results[i - 1] = "Buzz"; // Divisible by 5
            } else {
                results[i - 1] = Integer.toString(i); // Not divisible by 3 or 5
            }
        }

        // Display the results
        for (int i = 0; i < results.length; i++) {
            System.out.println("Position " + (i + 1) + " = " + results[i]);
        }
    }
}
