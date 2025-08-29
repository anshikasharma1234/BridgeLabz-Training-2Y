package level1;

import java.util.Scanner;
public class StoreNumber {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        double[] numbers = new double[10];
	        double total = 0.0;
	        int index = 0;
	        System.out.println("Enter up to 10 positive numbers (enter 0 or negative number to stop):");
	        while (true) {
	            System.out.print("Enter number " + (index + 1) + ": ");
	            double num = sc.nextDouble();
	            if (num <= 0) {
	                break;
	            }
	            if (index < numbers.length) {
	                numbers[index] = num;
	                index++;
	                System.out.println("Maximum of 10 numbers reached.");
	                break;
	            }
	        }
	        for (int i = 0; i < index; i++) {
	            total += numbers[i];
	        }
	        System.out.println("\nNumbers entered:");
	        for (int i = 0; i < index; i++) {
	            System.out.print(numbers[i] + " ");
	        }
	        System.out.println("\nTotal sum = " + total);

	        sc.close();
	    }
	}
