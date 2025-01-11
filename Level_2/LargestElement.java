import java.util.*;

class LargestElement {
    public static void main(String[] args) {
        // Creating Scanner object
        Scanner sc = new Scanner(System.in);

        // Taking input for a number with at least 10 digits
        System.out.print("Enter a number with at least 10 digits: ");
        long number = sc.nextLong(); // Use long to accommodate large numbers

        // Define a variable for the maximum array size
        int maxDigit = 10;

        // Define an array to store the digits (size maxDigit)
        int arr[] = new int[maxDigit];

        // Create an integer variable index with the value 0 to reflect the array index
        int index = 0;

        // Use a loop to extract digits from the number
        while (number > 0) {
            int temp = (int) (number % 10); // Extract the last digit
            arr[index] = temp; // Store the digit in the array
            number /= 10; // Remove the last digit from the number
            ++index;
            if (index == maxDigit) { // If index reaches maxDigit, break the loop
                break;
            }
        }

        // Define variables to store the largest and second largest digits
        int max = Integer.MIN_VALUE, secmax = Integer.MIN_VALUE;

        // Loop through the array to find the largest and second-largest digits
        for (int i = 0; i < index; i++) { // Only iterate up to the filled part of the array
            int x = arr[i];
            if (x > max) { // If current digit is greater than max
                secmax = max; // Update second largest
                max = x; // Update largest
            } else if (x > secmax && x != max) { // If current digit is the second largest
                secmax = x;
            }
        }

        // Display the largest and second-largest digits
        System.out.println("The largest digit is: " + max);
        System.out.println("The second largest digit is: " + secmax);

        sc.close(); // Close the scanner
    }
}
