package level3;

import java.util.Scanner;

public class StudentScoreCared {
	    public static int[][] generateScores(int numStudents) {
	        int[][] scores = new int[numStudents][3];
	        for (int i = 0; i < numStudents; i++) {
	            for (int j = 0; j < 3; j++) {
	                scores[i][j] = 10 + (int) (Math.random() * 90); 
	            }
	        }
	        return scores;
	    }
	    public static double[][] calculateTotalAveragePercentage(int[][] scores) {
	        int numStudents = scores.length;
	        double[][] result = new double[numStudents][3]; 

	        for (int i = 0; i < numStudents; i++) {
	            int total = scores[i][0] + scores[i][1] + scores[i][2];
	            double average = total / 3.0;
	            double percentage = (total / 300.0) * 100;

	            average = Math.round(average * 100.0) / 100.0;
	            percentage = Math.round(percentage * 100.0) / 100.0;

	            result[i][0] = total;
	            result[i][1] = average;
	            result[i][2] = percentage;
	        }
	        return result;
	    }

	    public static void displayScorecard(int[][] scores, double[][] result) {
	        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage");
	        for (int i = 0; i < scores.length; i++) {
	            System.out.print((i + 1) + "\t");
	            System.out.print(scores[i][0] + "\t");
	            System.out.print(scores[i][1] + "\t\t");
	            System.out.print(scores[i][2] + "\t");
	            System.out.print((int) result[i][0] + "\t"); 
	            System.out.print(result[i][1] + "\t");      
	            System.out.print(result[i][2] + "\t");     
	            System.out.println();
	        }
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter the number of students: ");
	        int numStudents = sc.nextInt();

	        int[][] scores = generateScores(numStudents);
	        double[][] result = calculateTotalAveragePercentage(scores);
	        displayScorecard(scores, result);

	        sc.close();
	    
	}

}
