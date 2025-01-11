import java.util.*;

class SmallestAndLargest {
    public static void main(String[] args) {
        // Creating Scanner object for user input
        Scanner sc = new Scanner(System.in);
        
        // Get integer input for three numbers
        System.out.print("Enter the number1: ");
        int number1 = sc.nextInt();
        System.out.print("Enter the number2: ");
        int number2 = sc.nextInt();
        System.out.print("Enter the number3: ");
        int number3 = sc.nextInt();
        
        // Call method to find smallest and largest numbers
        int[] result = findSmallestAndLargest(number1, number2, number3);
        
        // Print the smallest and largest numbers
        System.out.println("Smallest number is: " + result[0]);
        System.out.println("Largest number is: " + result[1]);
    }

    // Method to find smallest and largest numbers
    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
        int smallest, largest;

        // Find the smallest number
        smallest = Math.min(number1, Math.min(number2, number3));

        // Find the largest number
        largest = Math.max(number1, Math.max(number2, number3));
        
        // Return the result as an array [smallest, largest]
        return new int[]{smallest, largest};
    }
}
