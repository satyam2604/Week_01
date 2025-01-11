import java.util.*;

class HandShakes{
	public static void main(String [] args){
		// Creating Scanner object
        Scanner sc = new Scanner(System.in);
		
		// Get integer input for number of students
		System.out.print("Enter the number of students: ");
        int students = sc.nextInt();
	}
	public static int handshakes(int students){
		return ((students*(students - 1))/2);
	}
}