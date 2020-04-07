import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/*Tania Torres
 * Texas Pick 3 assignment
 * SPR 2020 | 2606825
 * 
 */
public class Texaspick3 {

		public static void main(String[] args) {
		
			//declaring variables
			int myPick3Choice;
			
			//Prompting for input and displaying 
			System.out.println("Enter your Pick 3 choice (0-999): ");
			Scanner pickChoice = new Scanner(System.in);
			myPick3Choice = pickChoice.nextInt();
			playPick3(myPick3Choice);
		
		}
		
		public static void playPick3(int myPick3) {
			
			int playCounter = 0;
			int myPick3Result;
//			while loop displaying results
			do {
				myPick3Result = officialPlayPick3();
				
				if(myPick3Result != myPick3) {
					playCounter += 1;
					myPick3Result = officialPlayPick3();
				} 
				
			} while (myPick3Result != myPick3); 
				
			System.out.println("PlayCounter = " + playCounter);
		}
		public static int officialPlayPick3() {
			 /**
			  * officialPlayPick3()
			  * Returns a random number from 0 to 999
			  * @return int
			  */

	        final int MIN_RANGE_VALUE  = 0;

	        final int MAX_RANGE_VALUE = 999;

	       return ThreadLocalRandom.current().nextInt(MIN_RANGE_VALUE,MAX_RANGE_VALUE + 1);
		}
		
		
	}

