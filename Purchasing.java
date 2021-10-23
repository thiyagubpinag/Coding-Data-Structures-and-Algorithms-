package FlowServe;

import java.util.ArrayList;

public class Purchasing extends Cost {

	private int noOftickets;

	private int remainingTickets;

	String movieName;

	private int getNoOftickets() {
		return noOftickets;
	}

	private void setNoOftickets(int noOftickets) {
		this.noOftickets = noOftickets;
	}

	private int getRemainingTickets() {
		return remainingTickets;
	}

	private void setRemainingTickets(int remainingTickets) {
		this.remainingTickets = remainingTickets;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

}
