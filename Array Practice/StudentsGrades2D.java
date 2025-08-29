package level2;
import java.util.Scanner;
public class StudentsGrades2D {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter number of students: ");
	        int n = sc.nextInt();
	        int[][] marks = new int[n][3];   
	        double[] percentage = new double[n];
	        char[] grade = new char[n];

	        for (int i = 0; i < n; i++) {
	            System.out.println("\nEnter marks for Student " + (i + 1));

	            for (int j = 0; j < 3; j++) {
	                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";
	                int mark;
	                do {
	                    System.out.print(subject + " (0-100): ");
	                    mark = sc.nextInt();
	                    if (mark < 0 || mark > 100) {
	                        System.out.println("❌ Invalid marks! Please enter between 0 and 100.");
	                    }
	                } while (mark < 0 || mark > 100);

	                marks[i][j] = mark;
	            }
	            int total = marks[i][0] + marks[i][1] + marks[i][2];
	            percentage[i] = (total / 300.0) * 100;
	            if (percentage[i] >= 90) {
	                grade[i] = 'A';
	            } else if (percentage[i] >= 75) {
	                grade[i] = 'B';
	            } else if (percentage[i] >= 50) {
	                grade[i] = 'C';
	            } else {
	                grade[i] = 'D';
	            }
	        }
	        System.out.println("\n--- Student Report ---");
	        System.out.printf("%-10s %-10s %-10s %-10s %-12s %-8s%n", 
	                          "Physics", "Chemistry", "Maths", "Total", "Percentage", "Grade");

	        for (int i = 0; i < n; i++) {
	            int total = marks[i][0] + marks[i][1] + marks[i][2];
	            System.out.printf("%-10d %-10d %-10d %-10d %-12.2f %-8c%n", 
	                              marks[i][0], marks[i][1], marks[i][2], 
	                              total, percentage[i], grade[i]);
	        }

	        sc.close();
	    
	}

}
