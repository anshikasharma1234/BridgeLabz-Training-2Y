package control_flow;

import java.util.Scanner;
public class SumUntilZero {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        double total = 0.0;   // to store sum
	        double number;        // to store user input

	        // Ask first number
	        System.out.print("Enter a number (0 to stop): ");
	        number = sc.nextDouble();

	        // Loop until user enters 0
	        while (number != 0) {
	            total += number; // add to sum

	            // Ask again inside loop
	            System.out.print("Enter a number (0 to stop): ");
	            number = sc.nextDouble();
	        }

	        // After loop ends
	        System.out.println("The total sum is " + total);

	        sc.close();
	    }
	}

