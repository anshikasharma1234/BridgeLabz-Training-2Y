package stringlevel_1;

import java.util.Scanner;
public class question3 {
	    public static char[] getCharacters(String str) {
	        char[] chars = new char[str.length()];
	        for (int i = 0; i < str.length(); i++) {
	            chars[i] = str.charAt(i);
	        }
	        return chars;
	    }
	    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
	        if (arr1.length != arr2.length) {
	            return false;
	        }
	        for (int i = 0; i < arr1.length; i++) {
	            if (arr1[i] != arr2[i]) {
	                return false;
	            }
	        }
	        return true;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a string: ");
	        String inputStr = scanner.next();

	        char[] charsUserDefined = getCharacters(inputStr);

	        char[] charsBuiltIn = inputStr.toCharArray();

	        boolean areEqual = compareCharArrays(charsUserDefined, charsBuiltIn);

	        System.out.println("Characters using user-defined method: ");
	        for (char c : charsUserDefined) {
	            System.out.print(c + " ");
	        }
	        System.out.println();

	        System.out.println("Characters using toCharArray(): ");
	        for (char c : charsBuiltIn) {
	            System.out.print(c + " ");
	        }
	        System.out.println();

	        System.out.println("Are character arrays equal? " + areEqual);
	    }
	}
