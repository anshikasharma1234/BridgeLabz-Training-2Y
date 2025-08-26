package control_flow;

import java.util.Scanner;
public class PowerUsinhgWhile {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter the base number: ");
	        int number = sc.nextInt();

	        System.out.print("Enter the power: ");
	        int power = sc.nextInt();
	        int result = 1;
	        int counter = 0;

	        while (counter < power) {
	            result = result * number;  
	            counter++;                }

	        // Printing result
	        System.out.println(number + " raised to the power " + power + " is: " + result);

	        sc.close();
	    }
	}

