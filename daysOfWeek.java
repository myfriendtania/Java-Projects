import java.util.ArrayList;
import java.util.Scanner;

public class dayoftheweek {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in); 

		String[] daysOfWeek = new String[7];
		// Load Array
		daysOfWeek[0] = "Sunday";
		daysOfWeek[1] = "Monday";
		daysOfWeek[2] = "Tuesday";
		daysOfWeek[3] = "Wednesday";
		daysOfWeek[4] = "Thursday";
		daysOfWeek[5] = "Friday";
		daysOfWeek[6] = "Saturday";
		
		System.out.println(daysOfWeek);
		
		ArrayList<String> daysOfWeeksList = new ArrayList<String>();
		daysOfWeeksList.add("Sunday");
		daysOfWeeksList.add("Monday");
		daysOfWeeksList.add("Tuesday");
		daysOfWeeksList.add("Wednesday");
		daysOfWeeksList.add("Thursday");
		daysOfWeeksList.add("Friday");
		daysOfWeeksList.add("Saturday");
		

		int dowIndex;
		String doAgain; 

		do {
			System.out.print("Enter the day of the Week: "); // User Prompt
			dowIndex = keyboard.nextInt();
			dowIndex = dowIndex - 1; // Adjust index to align with Array
			
			if (dowIndex >= 0 && dowIndex <= 6) {
				System.out.println("The day of the week is " + daysOfWeek[dowIndex]);
			} else {
				System.out.println("Invalid Entry");
			}
			System.out.print("Try again (Y/N):");
			doAgain = keyboard.next();
		} while (doAgain.equalsIgnoreCase("Y")); // do while Y

		keyboard.close();
		System.out.println("Done!"); // just to know this terminated OK.
	}
}
