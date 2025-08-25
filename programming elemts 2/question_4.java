package programming_element2;
import java.util.Scanner;
public class question_4 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the distance in feet: ");
	        int distanceInFeet = sc.nextInt();
	        final int FEET_IN_YARD = 3;
	        final int YARDS_IN_MILE = 1760;
	        int distanceInYards = distanceInFeet / FEET_IN_YARD;
	        int distanceInMiles = distanceInYards / YARDS_IN_MILE;
	        System.out.println("The distance in yards is " + distanceInYards +
	                           " while the distance in miles is " + distanceInMiles);

	        sc.close();
	    }

}
