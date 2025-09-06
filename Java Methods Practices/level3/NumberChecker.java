package level3;

import java.util.Arrays;
public class NumberChecker {
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
	    public static boolean isDuckNumber(int[] digits) {
	        for (int digit : digits) {
	            if (digit != 0) return true;
	        }
	        return false;
	    }
	    public static boolean isArmstrongNumber(int[] digits) {
	        int sum = 0;
	        int n = digits.length;
	        for (int digit : digits) {
	            sum += Math.pow(digit, n);
	        }
	        int number = 0;
	        for (int digit : digits) {
	            number = number * 10 + digit;
	        }
	        return sum == number;
	    }

	    public static int[] findLargestAndSecondLargest(int[] digits) {
	        int largest = Integer.MIN_VALUE;
	        int secondLargest = Integer.MIN_VALUE;

	        for (int digit : digits) {
	            if (digit > largest) {
	                secondLargest = largest;
	                largest = digit;
	            } else if (digit > secondLargest && digit != largest) {
	                secondLargest = digit;
	            }
	        }

	        return new int[]{largest, secondLargest};
	    }
	    public static int[] findSmallestAndSecondSmallest(int[] digits) {
	        int smallest = Integer.MAX_VALUE;
	        int secondSmallest = Integer.MAX_VALUE;

	        for (int digit : digits) {
	            if (digit < smallest) {
	                secondSmallest = smallest;
	                smallest = digit;
	            } else if (digit < secondSmallest && digit != smallest) {
	                secondSmallest = digit;
	            }
	        }

	        return new int[]{smallest, secondSmallest};
	    }

	    public static void main(String[] args) {
	        int number = 153;
	        System.out.println("Number: " + number);

	        int count = countDigits(number);
	        System.out.println("Number of digits: " + count);
	        int[] digits = storeDigits(number);
	        System.out.println("Digits array: " + Arrays.toString(digits));
	        System.out.println("Is Duck Number? " + isDuckNumber(digits));
	        System.out.println("Is Armstrong Number? " + isArmstrongNumber(digits));
	        int[] largestDigits = findLargestAndSecondLargest(digits);
	        System.out.println("Largest digit: " + largestDigits[0] + ", Second Largest digit: " + largestDigits[1]);
	        int[] smallestDigits = findSmallestAndSecondSmallest(digits);
	        System.out.println("Smallest digit: " + smallestDigits[0] + ", Second Smallest digit: " + smallestDigits[1]);
	    }
	}
