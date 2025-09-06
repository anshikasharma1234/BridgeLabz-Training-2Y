package level3;

import java.util.Scanner;
public class DistanceAndLines {
	    public static double calculateDistance(double x1, double y1, double x2, double y2) {
	        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
	    }
	    public static double[] findLineEquation(double x1, double y1, double x2, double y2) {
	        double m, b;
	        if (x2 != x1) {
	            m = (y2 - y1) / (x2 - x1); 
	            b = y1 - m * x1;       
	        } else {
	            m = Double.POSITIVE_INFINITY; 
	            b = x1;                     
	        }
	        return new double[]{m, b};
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter coordinates of first point (x1 y1): ");
	        double x1 = sc.nextDouble();
	        double y1 = sc.nextDouble();

	        System.out.print("Enter coordinates of second point (x2 y2): ");
	        double x2 = sc.nextDouble();
	        double y2 = sc.nextDouble();

	        double distance = calculateDistance(x1, y1, x2, y2);
	        System.out.printf("Euclidean distance between points: %.4f%n", distance);

	        double[] line = findLineEquation(x1, y1, x2, y2);

	        if (line[0] == Double.POSITIVE_INFINITY) {
	            System.out.println("The line is vertical: x = " + line[1]);
	        } else {
	            System.out.printf("Equation of the line: y = %.4fx + %.4f%n", line[0], line[1]);
	        }

	        sc.close();
	    
	}

}
