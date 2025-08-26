package control_flow;

import java.util.Scanner;
public class SumOfNaturalNumber {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Input number
	        System.out.print("Enter a number: ");
	        int number = sc.nextInt();

	        // Check if it's a natural number (0 and above are considered natural here)
	        if (number >= 0) {
	            // Formula for sum of n natural numbers
	            int sum = number * (number + 1) / 2;
	            System.out.println("The sum of " + number + " natural numbers is " + sum);
	        } else {
	            System.out.println("The number " + number + " is not a natural number");
	        }

	        sc.close();
	    }
	
}
