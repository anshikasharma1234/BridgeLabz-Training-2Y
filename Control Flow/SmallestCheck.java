package control_flow;

import java.util.Scanner;
public class SmallestCheck {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Input three numbers
	        System.out.print("Enter first number: ");
	        int number1 = sc.nextInt();

	        System.out.print("Enter second number: ");
	        int number2 = sc.nextInt();

	        System.out.print("Enter third number: ");
	        int number3 = sc.nextInt();

	        // Check if first is the smallest
	        boolean isSmallest = (number1 <= number2) && (number1 <= number3);

	        // Output result
	        System.out.println("Is the first number the smallest? " + isSmallest);

	        sc.close();
	    }
	}


