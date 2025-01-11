import java.util.*;

class Trigonometry {

    // Method to calculate trigonometric functions for an angle in degrees
    public double[] calculateTrigonometricFunctions(double angle) {
        // Convert angle to radians
        double radians = Math.toRadians(angle);
        
        // Calculate sine, cosine, and tangent
        double sinValue = Math.sin(radians);
        double cosValue = Math.cos(radians);
        double tanValue = Math.tan(radians);
        
        // Return the values in an array
        return new double[] {sinValue, cosValue, tanValue};
    }
    
    public static void main(String[] args) {
        // Create a Trigonometry object
        Trigonometry trig = new Trigonometry();
        
        // Input the angle in degrees
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter angle in degrees: ");
        double angle = scanner.nextDouble();
        
        // Get the trigonometric values
        double[] trigValues = trig.calculateTrigonometricFunctions(angle);
        
        // Display the results
        System.out.println("For angle " + angle + " degrees:");
        System.out.println("Sine: " + trigValues[0]);
        System.out.println("Cosine: " + trigValues[1]);
        System.out.println("Tangent: " + trigValues[2]);
        
        scanner.close();
    }
}
