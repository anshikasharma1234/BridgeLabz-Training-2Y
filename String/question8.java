package stringlevel_1;

import java.util.Scanner;
public class question8 {
	    public static void generateException(String[] names, int index) {
	        System.out.println("Generating ArrayIndexOutOfBoundsException:");
	        System.out.println(names[index]); 
	    }
	    public static void handleException(String[] names, int index) {
	        System.out.println("Handling ArrayIndexOutOfBoundsException:");
	        try {
	            System.out.println(names[index]); 
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
	        } catch (RuntimeException e) {
	            System.out.println("RuntimeException caught: " + e.getMessage());
	        }
	    }

	    public static void main(String[] args) {
	        String[] names = {"John", "Alice", "Bob"};
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter an index: ");
	        int index = scanner.nextInt();

	        try {
	            generateException(names, index);
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("ArrayIndexOutOfBoundsException caught in main: " + e.getMessage());
	        }

	        handleException(names, index);
	    }
	

}
