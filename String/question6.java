package stringlevel_1;

import java.util.Scanner;
public class question6 {
	    public static void generateException(String str) {
	        System.out.println("Generating IllegalArgumentException:");
	        System.out.println(str.substring(5, 0));
	        int age = -1;
	        validateAge(age);
	    }

	    public static void validateAge(int age) {
	        if (age < 0) {
	            throw new IllegalArgumentException("Age cannot be negative");
	        }
	    }
	    public static void handleException(String str) {
	        System.out.println("Handling IllegalArgumentException:");
	        try {
	            int age = -1;
	            validateAge(age);
	        } catch (IllegalArgumentException e) {
	            System.out.println("IllegalArgumentException caught: " + e.getMessage());
	        } catch (RuntimeException e) {
	            System.out.println("RuntimeException caught: " + e.getMessage());
	        }
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter your age: ");
	        // String inputStr = scanner.next();
	        int age = scanner.nextInt();

	        try {
	            validateAge(age);
	        } catch (IllegalArgumentException e) {
	            System.out.println("IllegalArgumentException caught in main: " + e.getMessage());
	        }

	        handleException("");
	    }
	}

