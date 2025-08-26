package control_flow;

import java.util.Scanner;
public class LeapYearIf {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Taking year input
	        System.out.print("Enter a year (>=1582): ");
	        int year = sc.nextInt();
	        if (year < 1582) {
	            System.out.println("The program works only for years >= 1582 (Gregorian calendar).");
	        } else {
	            if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
	                System.out.println(year + " is a Leap Year.");
	            } else {
	                System.out.println(year + " is NOT a Leap Year.");
	            }
	        }

	        sc.close();
	    }
	}

