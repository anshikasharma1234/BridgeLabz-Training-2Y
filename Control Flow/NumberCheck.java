package control_flow;

import java.util.Scanner;
public class NumberCheck {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Input number
	        System.out.print("Enter a number: ");
	        int number = sc.nextInt();

	        // Check positive, negative, or zero
	        if (number > 0) {
	            System.out.println("positive");
	        } else if (number < 0) {
	            System.out.println("negative");
	        } else {
	            System.out.println("zero");
	        }

	        sc.close();
	    }

}
