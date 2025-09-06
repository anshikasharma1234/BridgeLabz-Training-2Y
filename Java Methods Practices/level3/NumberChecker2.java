package level3;

import java.util.Arrays;

public class NumberChecker2 {

	    public static int countDigits(int number) {
	        return String.valueOf(Math.abs(number)).length();
	    }

	    public static int[] storeDigits(int number) {
	        number = Math.abs(number);
	        int count = countDigits(number);
	        int[] digits = new int[count];
	        for (int i = count - 1; i >= 0; i--) {
	            digits[i] = number % 10;
	            number /= 10;
	        }
	        return digits;
	    }
	    public static int sumOfDigits(int[] digits) {
	        int sum = 0;
	        for (int digit : digits) sum += digit;
	        return sum;
	    }

	    public static int sumOfSquares(int[] digits) {
	        int sum = 0;
	        for (int digit : digits) sum += Math.pow(digit, 2);
	        return sum;
	    }
	    public static boolean isHarshad(int number, int[] digits) {
	        int sum = sumOfDigits(digits);
	        if (sum == 0) return false; 
	        return number % sum == 0;
	    }

	    public static int[][] digitFrequency(int[] digits) {
	        int[][] freq = new int[10][2];
	        for (int i = 0; i < 10; i++) freq[i][0] = i;

	        for (int digit : digits) {
	            freq[digit][1]++;
	        }

	        return freq;
	    }

	    public static void main(String[] args) {
	        int number = 21; 
	        System.out.println("Number: " + number);

	        int count = countDigits(number);
	        System.out.println("Number of digits: " + count);

	        int[] digits = storeDigits(number);
	        System.out.println("Digits array: " + Arrays.toString(digits));

	        int sum = sumOfDigits(digits);
	        System.out.println("Sum of digits: " + sum);

	        int sumSquares = sumOfSquares(digits);
	        System.out.println("Sum of squares of digits: " + sumSquares);

	        System.out.println("Is Harshad Number? " + isHarshad(number, digits));

	        int[][] freq = digitFrequency(digits);
	        System.out.println("Digit frequencies:");
	        for (int i = 0; i < freq.length; i++) {
	            if (freq[i][1] > 0) {
	                System.out.println("Digit " + freq[i][0] + " occurs " + freq[i][1] + " time(s)");
	            }
	        }
	    
	}

}
