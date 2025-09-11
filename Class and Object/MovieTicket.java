package javaclass;

public class MovieTicket {
	   String movieName;
	    String seatNumber;
	    double price;

	    public void bookTicket(String movie, String seat, double ticketPrice) {
	        movieName = movie;
	        seatNumber = seat;
	        price = ticketPrice;
	    }

	    public void displayTicket() {
	        System.out.println("Movie Name: " + movieName);
	        System.out.println("Seat Number: " + seatNumber);
	        System.out.println("Price: " + price);
	    }

	    public static void main(String[] args) {
	        MovieTicket ticket = new MovieTicket();
	        ticket.bookTicket("Avengers: Endgame", "A10", 250.0);
	        ticket.displayTicket();
	    }
	}

