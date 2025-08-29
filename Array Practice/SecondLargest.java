package level2;

import java.util.Scanner;
public class SecondLargest {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int number = sc.nextInt();

	        int maxDigit = 10; 
	        int[] digits = new int[maxDigit];
	        int index = 0;
	        while (number != 0 && index < maxDigit) {
	            digits[index] = number % 10;
	            number /= 10; 
	            index++;
	        }
	        if (index == 0) {
	            System.out.println("No digits found!");
	            return;}
	        int largest = -1, secondLargest = -1;

	        for (int i = 0; i < index; i++) {
	            int d = digits[i];
	            if (d > largest) {
	                secondLargest = largest;
	                largest = d; 
	            } else if (d > secondLargest && d != largest) {
	                secondLargest = d;
	            }
	        }
	        System.out.println("\nDigits stored in array:");
	        for (int i = 0; i < index; i++) {
	            System.out.print(digits[i] + " ");
	        }

	        System.out.println("\nLargest digit = " + largest);
	        if (secondLargest != -1) {
	            System.out.println("Second Largest digit = " + secondLargest);
	        } else {
	            System.out.println("No second largest digit found (all digits same).");
	        }

	        sc.close();
	    }
}
