/* Tania Torres
 * 2606825 | Spring 2020
 * Professor Keith
 * Movie Ticket assignment
 */

import java.time.LocalDateTime;

public class MovieTicket {

	String movieTitle;
	LocalDateTime movieDateTime;
	String theatreName = "Cinerama";
	int screenNbr;
	int seatNbr;
	
	MovieTicket() {
		
	}
	
	MovieTicket(String movieTitle, LocalDateTime movieDateTime) {
		this.movieTitle = movieTitle;
		this.movieDateTime = movieDateTime;
	}
	
	MovieTicket(String movieTitle, LocalDateTime movieDateTime, int seatNbr) {
		this.movieTitle = movieTitle;
		this.movieDateTime = movieDateTime;
		this.seatNbr = seatNbr;	
	}

	public boolean isValid() {
		
		int seatNbr = 0;
		String movieTitle = " ";
		
		if (seatNbr != 0) {	
		}
		if (movieTitle != " ") {
			return true;
		}
		else {
			return false;
		}
		
		}
	
	public String getMovieTitle() {
		return movieTitle;
	}

	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
	}

	public LocalDateTime getMovieDateTime() {
		return movieDateTime;
	}

	public void setMovieDateTime(LocalDateTime movieDateTime) {
		this.movieDateTime = movieDateTime;
	}

	public String getTheatreName() {
		return theatreName;
	}

	public void setTheatreName(String theatreName) {
		this.theatreName = theatreName;
	}

	public int getScreenNbr() {
		return screenNbr;
	}

	public void setScreenNbr(int screenNbr) {
		this.screenNbr = screenNbr;
	}

	public int getSeatNbr() {
		return seatNbr;
	}

	public void setSeatNbr(int seatNbr) {
		this.seatNbr = seatNbr;
	}

	@Override
	public String toString() {
		return "MovieTicket [movieTitle=" + movieTitle + ", movieDateTime=" + movieDateTime + ", theatreName="
				+ theatreName + ", screenNbr=" + screenNbr + ", seatNbr=" + seatNbr + "]";
	}
	
}