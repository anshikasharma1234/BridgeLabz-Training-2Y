package stringlevel_1;

import java.util.Scanner;
public class question5 {
	    public static void generateException(String str) {
	        System.out.println("Generating StringIndexOutOfBoundsException:");
	        System.out.println(str.charAt(str.length())); 
	    }
	    public static void handleException(String str) {
	        System.out.println("Handling StringIndexOutOfBoundsException:");
	        try {
	            System.out.println(str.charAt(str.length())); 
	        } catch (StringIndexOutOfBoundsException e) {
	            System.out.println("StringIndexOutOfBoundsException caught: " + e.getMessage());
	        }
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String inputStr = scanner.next();

	        try {
	            generateException(inputStr);
	        } catch (StringIndexOutOfBoundsException e) {
	            System.out.println("StringIndexOutOfBoundsException caught in main: " + e.getMessage());
	        }

	        handleException(inputStr);
	    }
	}

