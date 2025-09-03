package stringlevel_1;

import java.util.Scanner;
public class question9 {

	    public static String convertToUppercase(String str) {
	        StringBuilder uppercaseStr = new StringBuilder();
	        for (int i = 0; i < str.length(); i++) {
	            char c = str.charAt(i);
	            if (c >= 'a' && c <= 'z') {
	                uppercaseStr.append((char) (c - 32)); 
	            } else {
	                uppercaseStr.append(c);
	            }
	        }
	        return uppercaseStr.toString();
	    }
	    public static boolean compareStrings(String str1, String str2) {
	        if (str1.length() != str2.length()) {
	            return false;
	        }
	        for (int i = 0; i < str1.length(); i++) {
	            if (str1.charAt(i) != str2.charAt(i)) {
	                return false;
	            }
	        }
	        return true;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String inputStr = scanner.nextLine();

	        String uppercaseStrUserDefined = convertToUppercase(inputStr);

	        String uppercaseStrBuiltIn = inputStr.toUpperCase();

	        boolean areEqual = compareStrings(uppercaseStrUserDefined, uppercaseStrBuiltIn);

	        System.out.println("Uppercase string (user-defined method): " + uppercaseStrUserDefined);
	        System.out.println("Uppercase string (built-in method): " + uppercaseStrBuiltIn);
	        System.out.println("Are the two uppercase strings equal? " + areEqual);
	    }
	}

