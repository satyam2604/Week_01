import java.util.*;

class TriangularPark {
    public static void main(String[] args) {
        // Creating Scanner object for user input
        Scanner sc = new Scanner(System.in);
        
        // Take user input for 3 sides of the triangle (park's sides)
        System.out.print("Enter the side 1 of park in meters: ");
        int side1 = sc.nextInt();
        System.out.print("Enter the side 2 of park in meters: ");
        int side2 = sc.nextInt();
        System.out.print("Enter the side 3 of park in meters: ");
        int side3 = sc.nextInt();
        
        // Compute the perimeter of the triangle
        int perimeter = side1 + side2 + side3;
        
        // Total distance to be covered by the athlete (5 km = 5000 meters)
        int totalDistance = 5000; // 5 km in meters
        
        // Calculate and display the total rounds
        System.out.println("Total rounds to complete 5km: " + rounds(totalDistance, perimeter));
    }
    
    // Method to calculate the number of rounds needed to complete the run
    public static double rounds(int distance, int perimeter) {
        return (double) distance / perimeter; // Calculate rounds by dividing total distance by perimeter
    }
}
