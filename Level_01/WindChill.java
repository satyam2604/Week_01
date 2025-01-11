import java.util.*;

class WindChill{
	public static void main(String [] args){
		// Creating Scanner object
        Scanner sc = new Scanner(System.in);
		
		// Get double input for temperature
		System.out.print("Enter the temperature: ");
        double temperature = sc.nextDouble();
		
		// Get double input for wind speed
		System.out.print("Enter the wind speed: ");
        double windSpeed = sc.nextDouble();

		System.out.println("The Wind Chill is: " + calculateWindChill(temperature,windSpeed));
	}
	// Method to find Wind Chill
	public static double calculateWindChill(double temperature, double windSpeed){
		double windChill = 35.74 + 0.6215*temperature + (0.4275*temperature - 35.75) * Math.pow(windSpeed , 0.16);
		return windChill;
 	}
}