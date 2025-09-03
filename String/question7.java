package stringlevel_1;

import java.util.Scanner;
public class question7 {
	    public static void generateException(String str) {
	        System.out.println("Generating NumberFormatException:");
	        int number = Integer.parseInt(str); 
	        System.out.println("Parsed number: " + number);
	    }
	    public static void handleException(String str) {
	        System.out.println("Handling NumberFormatException:");
	        try {
	            int number = Integer.parseInt(str); 
	            System.out.println("Parsed number: " + number);
	        } catch (NumberFormatException e) {
	            System.out.println("NumberFormatException caught: " + e.getMessage());
	        } catch (RuntimeException e) {
	            System.out.println("RuntimeException caught: " + e.getMessage());
	        }
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string to parse as integer: ");
	        String inputStr = scanner.next();

	        try {
	            generateException(inputStr);
	        } catch (NumberFormatException e) {
	            System.out.println("NumberFormatException caught in main: " + e.getMessage());
	        }

	        handleException(inputStr);
	    }
	}



