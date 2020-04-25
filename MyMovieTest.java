/* Tania Torres
 * 2606825 | Spring 2020
 * Professor Keith
 * Movie Ticket assignment
 */

import java.time.LocalDateTime;

public class MyMovieTest {

	static LocalDateTime myTime = LocalDateTime.now();

	static String movieTitle = "Blade Runner";
	static LocalDateTime movieDateTime = myTime;
	static String theatreName = "Cinerama";
	static int screenNbr = 1;
	static int seatNbr = 0;

	public static void main(String[] args) {

		MovieTicket myMovieTest1 = new MovieTicket();

			String myMovieTestToString = myMovieTest1.toString();
			System.out.print(myMovieTestToString);

			boolean myMovieTestIsValid = myMovieTest1.isValid();
			System.out.println(" - isValid = " + myMovieTestIsValid);

		MovieTicket myMovieTest2 = new MovieTicket(movieTitle, movieDateTime);

			String myMovieTestToString2 = myMovieTest2.toString();
			System.out.print(myMovieTestToString2);

			boolean myMovieTestIsValid2 = myMovieTest2.isValid();
			System.out.println(" - isValid = " + myMovieTestIsValid2);

		MovieTicket myMovieTest3 = new MovieTicket(movieTitle, movieDateTime, seatNbr);

			String myMovieTestToString3 = myMovieTest3.toString();
			System.out.print(myMovieTestToString3);

			boolean myMovieTestIsValid3 = myMovieTest3.isValid();
			System.out.println(" - isValid = " + myMovieTestIsValid3);

	}

}
