package control_flow;
import java.util.Scanner;
public class RocketLaunchCountdown {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Input starting value for countdown
	        System.out.print("Enter the starting number for countdown: ");
	        int counter = sc.nextInt();

	        // Countdown using while loop
	        while (counter >= 1) {
	            System.out.println(counter);
	            counter--; // decrement by 1
	        }

	        System.out.println("Liftoff! 🚀");

	        sc.close();
	   
	}

}
