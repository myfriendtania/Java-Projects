import java.util.Scanner;

/* Tania Torres: Week 4 
* COSC-1436, SPR 2020
* Topic: Buy A Car
* Professor Keith Smelser
*/

public class BuyACar {
	public static void main(String[] args) { //method
		
		
		// Get model input from user
		Scanner modelInput = new Scanner(System.in);
		System.out.print("Enter a car model: ");
		String model = modelInput.next();
		
		// Get payment input from user
		Scanner paymentInput = new Scanner(System.in);
		System.out.print("Enter Expected Monthly Payment: ");
		Double monthlyPayment = paymentInput.nextDouble();
		
		
		// Get month input from user
		Scanner monthInput = new Scanner(System.in);
		System.out.print("Enter the Number of Payments to Make: ");
		int months = monthInput.nextInt();
	
		calculateAndDisplay(model, monthlyPayment, months);
	}
	public static void calculateAndDisplay(String model, Double payment, int months) {
		
		// Calculate total costs and format to a string with two decimal places
		String formattedTotalCosts = String.format("%.2f", payment * months);
		
		// Format payment into a string with two decimal places
		String  formattedPayment = String.format("%.2f", payment);
		
		// Print final results
		System.out.print( "I am looking for a " + model + " car that I can pay " + formattedPayment + 
		" per month for " + months + " months. My total cost would be " + formattedTotalCosts + ".");
	
	}
	
}
