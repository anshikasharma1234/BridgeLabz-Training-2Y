package stringlevel_1;

public class question4 {
	 public static void generateNullPointerException() {
	        String text = null;
	        System.out.println(text.length()); // This will throw NullPointerException
	    }

	    // Method to handle NullPointerException
	    public static void handleNullPointerException() {
	        String text = null;
	        try {
	            System.out.println(text.length()); // This will throw NullPointerException
	        } catch (NullPointerException e) {
	            System.out.println("NullPointerException caught: " + e.getMessage());
	        }
	    }

	    public static void main(String[] args) {
	        System.out.println("Generating NullPointerException:");
	        try {
	            generateNullPointerException();
	        } catch (NullPointerException e) {
	            System.out.println("NullPointerException caught in main: " + e.getMessage());
	        }

	        System.out.println("\nHandling NullPointerException:");
	        handleNullPointerException();
	    }

}
