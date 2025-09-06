package level3;

import java.util.Arrays;
public class ZaraBonus {
	    public static int[][] generateEmployeeData(int numEmployees) {
	        int[][] data = new int[numEmployees][2];
	        for (int i = 0; i < numEmployees; i++) {
	            data[i][0] = 10000 + (int)(Math.random() * 90000);
	            data[i][1] = 1 + (int)(Math.random() * 10); 
	        }
	        return data;
	    }

	    public static double[][] calculateNewSalaryAndBonus(int[][] employeeData) {
	        int numEmployees = employeeData.length;
	        double[][] newData = new double[numEmployees][3]; 

	        for (int i = 0; i < numEmployees; i++) {
	            int oldSalary = employeeData[i][0];
	            int years = employeeData[i][1];
	            double bonus = (years > 5) ? oldSalary * 0.05 : oldSalary * 0.02;
	            double newSalary = oldSalary + bonus;

	            newData[i][0] = oldSalary;
	            newData[i][1] = bonus;
	            newData[i][2] = newSalary;
	        }
	        return newData;
	    }

	    public static void displaySummary(double[][] newData) {
	        double totalOldSalary = 0;
	        double totalBonus = 0;
	        double totalNewSalary = 0;

	        System.out.printf("%-10s %-10s %-10s %-10s%n", "Employee", "OldSalary", "Bonus", "NewSalary");
	        for (int i = 0; i < newData.length; i++) {
	            double oldSalary = newData[i][0];
	            double bonus = newData[i][1];
	            double newSalary = newData[i][2];

	            totalOldSalary += oldSalary;
	            totalBonus += bonus;
	            totalNewSalary += newSalary;

	            System.out.printf("%-10d %-10.2f %-10.2f %-10.2f%n", i + 1, oldSalary, bonus, newSalary);
	        }

	        System.out.println("--------------------------------------------------");
	        System.out.printf("%-10s %-10.2f %-10.2f %-10.2f%n", "Total", totalOldSalary, totalBonus, totalNewSalary);
	    }

	    public static void main(String[] args) {
	        int numEmployees = 10;
	        int[][] employeeData = generateEmployeeData(numEmployees);
	        double[][] newData = calculateNewSalaryAndBonus(employeeData);
	        displaySummary(newData);
	    }
	}

	
