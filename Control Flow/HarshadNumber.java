package control_flow;
import java.util.Scanner;

public class HarshadNumber {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Get input
	        System.out.print("Enter an integer: ");
	        int number = sc.nextInt();

	        int temp = number;
	        int sum = 0;
	        while (temp > 0) {
	            int digit = temp % 10; 
	            sum += digit;          
	            temp /= 10;            
	        }
	        if (number % sum == 0) {
	            System.out.println(number + " is a Harshad Number.");
	        } else {
	            System.out.println(number + " is NOT a Harshad Number.");
	        }

	        sc.close();
	    }
}
