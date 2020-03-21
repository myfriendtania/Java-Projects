import java.util.Scanner;

public class doWhileLoop {

	public static void main(String[] args) {
		
		String menuChoice;
		String processedStr;
		
		do {
			System.out.println(" A. Buy Stock.");
			System.out.println(" B. Sell Stock.");
			System.out.println(" X. Exit.");
			
			Scanner scanner = new Scanner(System.in);
			System.out.print("Enter your Selection: ");
			
			menuChoice = scanner.nextLine();
			processedStr = menuChoice.toUpperCase();
			
			if(processedStr.equals("A")) {
				System.out.println("Buy Stock");
			} else if (processedStr.equals("B")) {
				System.out.println("Sell Stock");
			} else if (!processedStr.equals("X")) {
				System.out.println("Invalid selection");
			}
			
			
		} while(!processedStr.equals("X"));

		
	}
}
