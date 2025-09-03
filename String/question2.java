package stringlevel_1;

import java.util.Scanner;
public class question2 {
	    public static String createSubstring(String str, int start, int end) {
	        StringBuilder substring = new StringBuilder();
	        for (int i = start; i < end; i++) {
	            substring.append(str.charAt(i));
	        }
	        return substring.toString();
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
	        String inputStr = scanner.next();

	        System.out.print("Enter start index: ");
	        int startIndex = scanner.nextInt();

	        System.out.print("Enter end index: ");
	        int endIndex = scanner.nextInt();

	        String substringCharAt = createSubstring(inputStr, startIndex, endIndex);

	        String substringBuiltIn = inputStr.substring(startIndex, endIndex);

	        boolean areEqual = compareStrings(substringCharAt, substringBuiltIn);

	        System.out.println("Substring using charAt(): " + substringCharAt);
	        System.out.println("Substring using substring(): " + substringBuiltIn);
	        System.out.println("Are substrings equal? " + areEqual);
	    }
	}
}
