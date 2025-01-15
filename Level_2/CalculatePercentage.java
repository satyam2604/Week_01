import java.util.Random;
import java.util.Scanner;

class CalculatePercentage {
    public static void main(String[] args) {
        // Create Scanner object to get user input
        Scanner sc = new Scanner(System.in);

        // Take number of students as input
        System.out.print("Enter number of students: ");
        int noOfStudents = sc.nextInt();

        // Call a method to generate random scores of Physics, Chemistry, and Math
        int[][] scores = generatePCMScores(noOfStudents);

        // Call a method to calculate total, average, and percentage
        double[][] calculations = calculateTotalAveragePercentage(scores);

        // Call a method to calculate grades based on percentage
        String[] grades = calculateGrades(calculations);

        // Call a method to display the complete scorecard
        displayScorecard(scores, calculations, grades);

        sc.close(); // Close Scanner
    }

    // Method to generate random 2-digit scores for PCM
    public static int[][] generatePCMScores(int noOfStudents) {
        int[][] scores = new int[noOfStudents][3];
        Random random = new Random();

        for (int i = 0; i < noOfStudents; i++) {
            scores[i][0] = random.nextInt(81) + 20; // Physics score (20-100)
            scores[i][1] = random.nextInt(81) + 20; // Chemistry score (20-100)
            scores[i][2] = random.nextInt(81) + 20; // Math score (20-100)
        }
        return scores;
    }

    // Method to calculate total, average, and percentage
    public static double[][] calculateTotalAveragePercentage(int[][] scores) {
        double[][] results = new double[scores.length][3];
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            results[i][0] = total; // Store total
            results[i][1] = Math.round(average * 100.0) / 100.0; // Store average (rounded)
            results[i][2] = Math.round(percentage * 100.0) / 100.0; // Store percentage (rounded)
        }
        return results;
    }

    // Method to calculate grades based on percentage
    public static String[] calculateGrades(double[][] calculations) {
        String[] grades = new String[calculations.length];
        for (int i = 0; i < calculations.length; i++) {
            double percentage = calculations[i][2];
            if (percentage >= 80) {
                grades[i] = "A";
            } else if (percentage >= 70) {
                grades[i] = "B";
            } else if (percentage >= 60) {
                grades[i] = "C";
            } else if (percentage >= 50) {
                grades[i] = "D";
            } else if (percentage >= 40) {
                grades[i] = "E";
            } else {
                grades[i] = "R"; // Repeat
            }
        }
        return grades;
    }

    // Method to display the scorecard in a tabular format
    public static void displayScorecard(int[][] scores, double[][] calculations, String[] grades) {
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-15s %-10s%n",
                "Student", "Physics", "Chemistry", "Math", "Total", "Average", "Percentage", "Grade");
        System.out.println("-----------------------------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%-10d %-10d %-10d %-10d %-10.0f %-10.2f %-15.2f %-10s%n",
                    (i + 1), scores[i][0], scores[i][1], scores[i][2],
                    calculations[i][0], calculations[i][1], calculations[i][2], grades[i]);
        }
    }
}
