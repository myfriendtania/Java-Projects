import java.util.Scanner;

/* Tania Torres, 2606825
 *  COSC-1437
 *  Week 6, Grading
 */

class Grading {

	public static void main(String[] args) {

		short grade;

		Scanner input = new Scanner(System.in);

		// Prompt user to enter a grade
		System.out.print("Enter grade (0-100): ");

		// Assign input to grade short state variable
		grade = input.nextShort();

		if (grade >= 90 && grade <= 100) {
			System.out.println("Letter Grade is: A");
		} else if (grade >= 80 && grade <= 89) {
			System.out.println("Letter Grade is: B");
		} else if (grade >= 70 && grade <= 79) {
			System.out.println("Letter Grade is: C");
		} else if (grade >= 60 && grade <= 69) {
			System.out.println("Letter Grade is: D");
		} else if (grade < 60) {
			System.out.println("Letter Grade is: F");
		} else {
			System.out.print("Grade entered is out of range, please enter a grade between (0-100)");
		}

	}
}
