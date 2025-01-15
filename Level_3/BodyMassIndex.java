import java.util.Scanner;

class BodyMassIndex {
    public static void main(String[] args) {
        // Create Scanner object to get user input
        Scanner sc = new Scanner(System.in);
		
		// 2D array to store height and weight of 10 persons
        double[][] heightWeight = new double[10][2];

        // Take input heightin cm and weight in kg of each persons
		for(int i=0; i<10; i++){
			System.out.print("Enter weight in kg for person "+(i+1)+" : " );
			heightWeight[i][0] = sc.nextDouble();
			
			System.out.print("Enter height in cm for person "+(i+1)+" : " );
			heightWeight[i][1] = sc.nextDouble();
		}
		
        // Call a method to compare BMI and status
        String[][] bmiResults = calculateBMIStatus(heightWeight);

        // Call a method to display the complete results
        displayResults(bmiResults);

        sc.close(); // Close Scanner
    }

    // Method to calculate BMI and status
    public static String[][] calculateBMIStatus(double[][] heightWeight) {
        String[][] results = new String[10][4];

        for (int i = 0; i < heightWeight.length; i++) {
            double weight = heightWeight[i][0];
            double heightInMeters = heightWeight[i][1] / 100; // Convert cm to meters
            double bmi = weight / (heightInMeters * heightInMeters); // BMI formula
            bmi = Math.round(bmi * 100.0) / 100.0; // Round to 2 decimal places

            String status;
            if (bmi < 18.5) {
                status = "Underweight";
            } else if (bmi >= 18.5 && bmi < 24.9) {
                status = "Normal";
            } else if (bmi >= 25 && bmi < 39.9) {
                status = "Overweight";
            } else {
                status = "Obese";
            }

            // Store the results
            results[i][0] = String.valueOf(heightWeight[i][1]); // Height in cm
            results[i][1] = String.valueOf(heightWeight[i][0]); // Weight in kg
            results[i][2] = String.valueOf(bmi); // BMI
            results[i][3] = status; // BMI Status
        }

        return results;
    }

    // Method to display the results in a tabular format
    public static void displayResults(String[][] results) {
        System.out.printf("%-10s %-10s %-10s %-15s%n", "Height(cm)", "Weight(kg)", "BMI", "Status");
        System.out.println("---------------------------------------------------");

        for (int i = 0; i < results.length; i++) {
            System.out.printf("%-10s %-10s %-10s %-15s%n",
                    results[i][0], results[i][1], results[i][2], results[i][3]);
        }
	}
}
