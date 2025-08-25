package programming_element2;

import java.util.Scanner;
public class question_6 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the first number: ");
	        int number1 = sc.nextInt();

	        System.out.print("Enter the second number: ");
	        int number2 = sc.nextInt();
	        if (number2 != 0) {
	            int quotient = number1 / number2;   
	            int remainder = number1 % number2; 
	            System.out.println("The Quotient is " + quotient +
	                               " and the Remainder is " + remainder +
	                               " of two numbers.");
	        } else {
	            System.out.println("Division by zero is not allowed.");
	        }

	        sc.close();
	    }
	}

