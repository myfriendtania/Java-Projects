import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		
		//declaring variables
		int currentBalance = 0;
		int amountToSaveEachMonth;
		int numberOfMonthsToSave;
		int currentSavingsMonth = 1;
		
		//Prompting for input and displaying 
		System.out.println("Enter amount to save each month: ");
		Scanner amountInput = new Scanner(System.in);
		amountToSaveEachMonth = amountInput.nextInt();
		
		System.out.println("Enter number of months to save: ");
		Scanner monthInput = new Scanner(System.in);
		numberOfMonthsToSave = monthInput.nextInt();
		
		//while loop displaying results
		while (currentSavingsMonth <= numberOfMonthsToSave) {	
		currentBalance += amountToSaveEachMonth;
		System.out.println("For month " + currentSavingsMonth + ", the balance is: " + currentBalance);
		currentSavingsMonth += 1;
		
		}

	}

}
