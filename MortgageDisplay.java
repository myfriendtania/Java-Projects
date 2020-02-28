import java.util.Scanner;

public class mortgagedisplay {

	public static void main(String[] args) {

		byte residence;
		int creditScore;
		boolean isPrimaryResidence;

		// Gather input for residence
		System.out.println("Enter 1 if the Home will be the primary residence, or 0 if not the primary residence: ");
		@SuppressWarnings("resource")
		Scanner residenceInput = new Scanner(System.in);
		residence = residenceInput.nextByte();

		// determine if primary residence
		isPrimaryResidence = residence != 0;

		// Gather input for the credit score
		System.out.println("Enter your credit score: ");
		@SuppressWarnings("resource")
		Scanner creditScoreInput = new Scanner(System.in);
		creditScore = creditScoreInput.nextInt();

		// Evaluate calculated conditions and render final result
		if (isPrimaryResidence && creditScore > 563) {
			System.out.println("Qualifies for the loan");
		} else {
			System.out.println("Does not qualify for the loan");
		}

	}
}
