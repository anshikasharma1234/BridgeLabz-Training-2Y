package level3;

import java.util.Arrays;
public class NumberChecker3 {
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
	    public static int[] reverseArray(int[] digits) {
	        int[] reversed = new int[digits.length];
	        for (int i = 0; i < digits.length; i++) {
	            reversed[i] = digits[digits.length - 1 - i];
	        }
	        return reversed;
	    }
	    public static boolean compareArrays(int[] arr1, int[] arr2) {
	        if (arr1.length != arr2.length) return false;
	        for (int i = 0; i < arr1.length; i++) {
	            if (arr1[i] != arr2[i]) return false;
	        }
	        return true;
	    }
	    public static boolean isPalindrome(int[] digits) {
	        int[] reversed = reverseArray(digits);
	        return compareArrays(digits, reversed);
	    }
	    public static boolean isDuckNumber(int[] digits) {
	        for (int digit : digits) {
	            if (digit != 0) return true; 
	        }
	        return false;
	    }

	    public static void main(String[] args) {
	        int number = 10501; 
	        System.out.println("Number: " + number);
	        int count = countDigits(number);
	        System.out.println("Number of digits: " + count);
	        int[] digits = storeDigits(number);
	        System.out.println("Digits array: " + Arrays.toString(digits));
	        int[] reversed = reverseArray(digits);
	        System.out.println("Reversed digits array: " + Arrays.toString(reversed));
	        System.out.println("Is Palindrome? " + isPalindrome(digits));
	        System.out.println("Is Duck Number? " + isDuckNumber(digits));
	    }
	}

