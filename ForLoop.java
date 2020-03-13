import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {

		// declaring
		double currentBalance;
		double newBalance;
		int yearCount;

		// final double declaration
		final double INTEREST_RATE = 1.05;

		// Prompt user for investment years
		System.out.print("Enter number of years to invest: ");
		Scanner yearInput = new Scanner(System.in);
		yearCount = yearInput.nextInt();

		System.out.print("Enter amount to invest: ");
		Scanner amountInput = new Scanner(System.in);
		currentBalance = amountInput.nextInt();
		
		// starting loop at year one
		for (int i = 1; i <= yearCount; i++) {
			
			// assigning currentBalance to new balance
			newBalance = currentBalance;
			
			// compute balance after interest rate
			newBalance = newBalance * INTEREST_RATE;
			
			// current balance now reset from new balance following int rate 
			currentBalance = newBalance;
			
			// format balance to two decimal places string
			String currentBalanceStr = String.format("%.2f", currentBalance);
			
			// output
			System.out.println("Year " + i + " balance = " + currentBalanceStr);
		}

	}

}
