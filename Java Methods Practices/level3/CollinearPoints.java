package level3;

import java.util.Scanner;
public class CollinearPoints {
	    public static boolean areCollinearSlope(int x1, int y1, int x2, int y2, int x3, int y3) {
	        int slope1_numerator = y2 - y1;
	        int slope1_denominator = x2 - x1;

	        int slope2_numerator = y3 - y2;
	        int slope2_denominator = x3 - x2;

	        int slope3_numerator = y3 - y1;
	        int slope3_denominator = x3 - x1;
	        return (slope1_numerator * slope2_denominator == slope2_numerator * slope1_denominator)
	            && (slope1_numerator * slope3_denominator == slope3_numerator * slope1_denominator);
	    }

	    public static boolean areCollinearArea(int x1, int y1, int x2, int y2, int x3, int y3) {
	        double area = 0.5 * (x1 * (y2 - y3) +
	                             x2 * (y3 - y1) +
	                             x3 * (y1 - y2));
	        return area == 0;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter coordinates of point A (x1 y1): ");
	        int x1 = sc.nextInt();
	        int y1 = sc.nextInt();

	        System.out.println("Enter coordinates of point B (x2 y2): ");
	        int x2 = sc.nextInt();
	        int y2 = sc.nextInt();

	        System.out.println("Enter coordinates of point C (x3 y3): ");
	        int x3 = sc.nextInt();
	        int y3 = sc.nextInt();

	        boolean collinearSlope = areCollinearSlope(x1, y1, x2, y2, x3, y3);
	        boolean collinearArea = areCollinearArea(x1, y1, x2, y2, x3, y3);

	        System.out.println("\nUsing Slope Formula: " + (collinearSlope ? "Collinear" : "Not Collinear"));
	        System.out.println("Using Area Formula: " + (collinearArea ? "Collinear" : "Not Collinear"));

	        sc.close();
	    }
	
}
