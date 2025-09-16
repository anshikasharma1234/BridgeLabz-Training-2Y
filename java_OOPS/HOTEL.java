package java_OOPS;

public class HOTEL {
	    private String guestName;
	    private String roomType;
	    private int nights;

	    public HOTEL() {
	        this.guestName = "Unknown Guest";
	        this.roomType = "Standard";
	        this.nights = 1;
	    }

	    public HOTEL(String guestName, String roomType, int nights) {
	        this.guestName = guestName;
	        this.roomType = roomType;
	        this.nights = nights;
	    }

	    public HOTEL(HOTEL other) {
	        this.guestName = other.guestName;
	        this.roomType = other.roomType;
	        this.nights = other.nights;
	    }

	    public void displayBooking() {
	        System.out.println("Guest: " + guestName +
	                           ", Room Type: " + roomType +
	                           ", Nights: " + nights);
	    }

	    public static void main(String[] args) {
	        HOTEL booking1 = new HOTEL();

	        HOTEL booking2 = new HOTEL("John Doe", "Deluxe", 3);

	        HOTEL booking3 = new HOTEL(booking2);

	        System.out.println("Booking 1 (Default):");
	        booking1.displayBooking();

	        System.out.println("\nBooking 2 (Parameterized):");
	        booking2.displayBooking();

	        System.out.println("\nBooking 3 (Copied):");
	        booking3.displayBooking();
	    }
	
}
