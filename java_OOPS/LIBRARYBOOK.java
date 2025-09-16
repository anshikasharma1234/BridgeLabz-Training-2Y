package java_OOPS;

public class LIBRARYBOOK {
	    private String title;
	    private String author;
	    private double price;
	    private boolean availability;

	    public LIBRARYBOOK() {
	        this.title = "Unknown Title";
	        this.author = "Unknown Author";
	        this.price = 0.0;
	        this.availability = true; 
	    }

	    public LIBRARYBOOK(String title, String author, double price, boolean availability) {
	        this.title = title;
	        this.author = author;
	        this.price = price;
	        this.availability = availability;
	    }

	    
	    public void borrowBook() {
	        if (availability) {
	            availability = false;
	            System.out.println("You have successfully borrowed: " + title);
	        } else {
	            System.out.println("Sorry, the book \"" + title + "\" is already borrowed.");
	        }
	    }

	    public void displayBook() {
	        System.out.println("Title: " + title + 
	                           ", Author: " + author + 
	                           ", Price: " + price + 
	                           ", Available: " + (availability ? "Yes" : "No"));
	    }

	    public static void main(String[] args) {
	        LIBRARYBOOK b1 = new LIBRARYBOOK("Java Basics", "John Doe", 399.99, true);
	        LIBRARYBOOK b2 = new LIBRARYBOOK("Python Essentials", "Alice Smith", 299.99, false);

	        System.out.println("Book 1 Details:");
	        b1.displayBook();
	        b1.borrowBook(); 
	        b1.displayBook();

	        System.out.println("\nBook 2 Details:");
	        b2.displayBook();
	        b2.borrowBook();
	    }
	
}
