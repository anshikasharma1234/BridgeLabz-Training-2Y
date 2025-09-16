package java_OOPS;

public class BOOK {
	    private String title;
	    private String author;
	    private double price;

	    public BOOK() {
	        this.title = "Unknown Title";
	        this.author = "Unknown Author";
	        this.price = 0.0;
	    }

	    public BOOK(String title, String author, double price) {
	        this.title = title;
	        this.author = author;
	        this.price = price;
	    }

	    public void displayDetails() {
	        System.out.println("Book Title: " + title);
	        System.out.println("Author: " + author);
	        System.out.println("Price: " + price);
	    }

	    public static void main(String[] args) {
	        BOOK book1 = new BOOK();
	        System.out.println("Book 1 (Default Constructor):");
	        book1.displayDetails();

	        System.out.println();

	        BOOK book2 = new BOOK("Java Basics", "John Doe", 399.99);
	        System.out.println("Book 2 (Parameterized Constructor):");
	        book2.displayDetails();
	    }
	
}
