import java.util.Scanner;

public class Tripplanner {

	public static void main(String[] args) {
		//declaring the variables
		double milesToTravel;
		double travelSpeedMPH;
		double travelMPG;
		double result = 0;
		
		//Prompt user for miles to travel
		System.out.println("Enter number of miles to travel: ");
		Scanner milesInput = new Scanner(System.in);
		milesToTravel = milesInput.nextInt();
		
		//prompt user for travel speed
		System.out.println("Enter travel speed (MPH): ");
		Scanner speedInput = new Scanner(System.in);
		travelSpeedMPH = speedInput.nextInt();
		
		//Prompt user for travel MPG
		System.out.println("Enter travel MPG: ");
		Scanner travelInput = new Scanner(System.in);
		travelMPG = travelInput.nextDouble();
		
		result = (milesToTravel / travelSpeedMPH);
		
		System.out.println("Time to travel is " + result + " hours."); }

		//Calculate time to travel
	public static void timeToTravel(int milesToTravel, int travelSpeedMPH) {
		System.out.println(milesToTravel / travelSpeedMPH);
		  
	}
}
