import java.util.*;

class SimpleInterest {
    public static void main(String[] args) {
        // Creating Scanner object
        Scanner sc = new Scanner(System.in);

        // Take user input for principal, rate, time
        System.out.print("Enter the principal: ");
        int principal = sc.nextInt();
        System.out.print("Enter the rate: ");
        int rate = sc.nextInt();
        System.out.print("Enter the time in years: ");
        int time = sc.nextInt();

        System.out.println("The Simple Interest is " + simpleinterest(principal, rate, time) + " for Principal " + principal + ", Rate of Interest " + rate + " and Time " + time+ " years");
    }

    public static double simpleinterest(int principal, int rate, int time) {
        return ((principal * rate * time) / 100.0); // Ensure division results in double
    }
}
