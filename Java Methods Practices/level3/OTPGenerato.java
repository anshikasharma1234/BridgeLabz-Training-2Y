package level3;

import java.util.Arrays;
public class OTPGenerato {
	    public static int generateOTP() {
	        return 100000 + (int) (Math.random() * 900000); 
	    }
	    public static boolean areUnique(int[] arr) {
	        for (int i = 0; i < arr.length - 1; i++) {
	            for (int j = i + 1; j < arr.length; j++) {
	                if (arr[i] == arr[j]) return false;
	            }
	        }
	        return true;
	    }

	    public static void main(String[] args) {
	        int numberOfOTPs = 10;
	        int[] otps = new int[numberOfOTPs];

	        for (int i = 0; i < numberOfOTPs; i++) {
	            otps[i] = generateOTP();
	        }
	        System.out.println("Generated OTPs: " + Arrays.toString(otps));

	        if (areUnique(otps)) {
	            System.out.println("All OTPs are unique.");
	        } else {
	            System.out.println("Some OTPs are repeated.");
	        }
	    
	}

}
