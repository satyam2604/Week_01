import java.util.*;

class LegalVote {
    public static void main(String[] args) {
        // define number of students who may be voting
		int noOfStudents = 10;
		
		// call a method to generate random ages of students to vote
		int [] studentAges = generateRandomAges(noOfStudents);
		
		// call a method to determine if students are eligible to vote
		String [] [] votingResults = checkVotingEligibility(studentAges);
		
		// call a method to display results 
		displayResults(votingResults);
    }

    // Method to generate random ages of students to vote
    public static int [] generateRandomAges(int noOfStudents) {
		int [] ages = new int[noOfStudents];
		Random random = new Random();
		
		for(int i=0; i<noOfStudents; i++){
			// Generates random ages between -10 and 98
            ages[i] = random.nextInt(109) - 10; 
		}
		return ages;
	}
	
	// Method to to determine if students are eligible to vote
	public static String [][] checkVotingEligibility(int [] studentAges){
		String[][] results = new String[studentAges.length][2];
		for(int i=0; i<studentAges.length; i++){
			results[i][0] = String.valueOf(studentAges[i]);
			if(studentAges[i]<0){
				results[i][1] = "Invalid Age";
			}else if(studentAges[i]>=18){
				results[i][1] = "Can vote";
			}else {
				results[i][1] = "Cannot Vote";
			}
		}
		return results;
	}

    // Method to to display results 
    public static void displayResults(String [][] votingResults) {
		// %-10s specifies a left-aligned string with a width of 10, %-15s specifies a left-aligned string with a width of 15, and %n adds a newline.
        System.out.printf("%-10s %-15s%n", "Age", "Voting Eligibility");
        System.out.println("------------------------------");

        for (String[] row : votingResults) {
            System.out.printf("%-10s %-15s%n", row[0], row[1]);
        }
    }
}