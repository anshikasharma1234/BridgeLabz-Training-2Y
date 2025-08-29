package level2;

import java.util.Scanner;
public class Employee {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        double[] salary = new double[n];
	        double[] years = new double[n];
	        double[] bonus = new double[n];
	        double totalBonus = 0, totalOld = 0, totalNew = 0;
	        for (int i = 0; i < n; i++) {
	            System.out.print("Enter salary of Employee " + (i + 1) + ": ");
	            salary[i] = sc.nextDouble();
	            System.out.print("Enter years of service of Employee " + (i + 1) + ": ");
	            years[i] = sc.nextDouble();

	            bonus[i] = (years[i] > 5) ? salary[i] * 0.05 : salary[i] * 0.02;
	            totalBonus += bonus[i];
	            totalOld += salary[i];
	            totalNew += (salary[i] + bonus[i]);
	        }
	        System.out.println("\n--- Employee Bonus Details ---");
	        for (int i = 0; i < n; i++) {
	            System.out.println("Emp " + (i + 1) + " | Old: " + salary[i] +
	                               " | Bonus: " + bonus[i] +
	                               " | New: " + (salary[i] + bonus[i]));
	        }

	        System.out.println("\nTotal Old Salary = " + totalOld);
	        System.out.println("Total Bonus Payout = " + totalBonus);
	        System.out.println("Total New Salary = " + totalNew);

	        sc.close();
	    }
	}
