package level3;

import java.util.Scanner;
public class CalenderDisplay {
	    static String[] months = {"January", "February", "March", "April", "May", "June",
	                              "July", "August", "September", "October", "November", "December"};
	    static int[] daysInMonth = {31, 28, 31, 30, 31, 30, 
	                                31, 31, 30, 31, 30, 31};
	    public static boolean isLeapYear(int year) {
	        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
	    }

	    public static int getDaysInMonth(int month, int year) {
	        if (month == 2) { // February
	            return isLeapYear(year) ? 29 : 28;
	        } else {
	            return daysInMonth[month - 1];
	        }
	    }

	    public static String getMonthName(int month) {
	        return months[month - 1];
	    }

	    public static int getFirstDayOfMonth(int month, int year) {
	        int m = month;
	        int y = year;
	        if (m < 3) {
	            m += 12;
	            y -= 1;
	        }
	        int K = y % 100;
	        int J = y / 100;
	        int h = (1 + 13*(m + 1)/5 + K + K/4 + J/4 + 5*J) % 7;
	        int day = ((h + 6) % 7); 
	        return day;
	    }

	    public static void displayCalendar(int month, int year) {
	        System.out.println("\n   " + getMonthName(month) + " " + year);
	        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

	        int firstDay = getFirstDayOfMonth(month, year);
	        int totalDays = getDaysInMonth(month, year);

	        // First loop for indentation
	        for (int i = 0; i < firstDay; i++) {
	            System.out.print("    "); 
	        }

	        for (int day = 1; day <= totalDays; day++) {
	            System.out.printf("%3d ", day);
	            if ((day + firstDay) % 7 == 0) { 
	                System.out.println();
	            }
	        }
	        System.out.println(); 
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter month (1-12): ");
	        int month = sc.nextInt();
	        System.out.print("Enter year: ");
	        int year = sc.nextInt();

	        displayCalendar(month, year);
	        sc.close();
	    
	}

}
