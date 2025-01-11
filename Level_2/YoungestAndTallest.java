import java.util.*;

class YoungestAndTallest {
    public static void main(String[] args) {
        // Creating Scanner object
        Scanner sc = new Scanner(System.in);

        // Create an int array of size 3 for the height of three friends
        int height[] = new int[3];

        // Create an int array of size 3 for the age of three friends
        int age[] = new int[3];

        // Taking input for age of the friends
        for (int i = 0; i < age.length; i++) {
            System.out.print("Enter age of friend " + (i + 1) + ": ");
            age[i] = sc.nextInt();
        }

        // Taking input for height of the friends
        for (int i = 0; i < height.length; i++) {
            System.out.print("Enter height of friend " + (i + 1) + " in centimeters: ");
            height[i] = sc.nextInt();
        }

        // Initializing variables to find the tallest and youngest
        int tallest = height[0];
        int youngest = age[0];

        // Finding the youngest friend using a for loop
        for (int i = 1; i < age.length; i++) { 
            if (age[i] < youngest) {
                youngest = age[i];
            }
        }

        // Finding the tallest friend using a for loop
        for (int i = 1; i < height.length; i++) { 
            if (height[i] > tallest) {
                tallest = height[i];
            }
        }

        // Displaying the youngest and tallest friend
        System.out.println("The youngest friend's age is: " + youngest);
        System.out.println("The tallest friend's height is: " + tallest);

        sc.close(); // Close the scanner to prevent resource leaks
    }
}
