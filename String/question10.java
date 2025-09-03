package stringlevel_1;

public class question10 {
	    public static String convertToLowercase(String str) {
	        StringBuilder lowercaseStr = new StringBuilder();
	        for (int i = 0; i < str.length(); i++) {
	            char c = str.charAt(i);
	            if (c >= 'A' && c <= 'Z') {
	                lowercaseStr.append((char) (c + 32)); 
	            } else {
	                lowercaseStr.append(c);
	            }
	        }
	        return lowercaseStr.toString();
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
	        String lowercaseStrUserDefined = convertToLowercase(inputStr);
	        String lowercaseStrBuiltIn = inputStr.toLowerCase();

	        boolean areEqual = compareStrings(lowercaseStrUserDefined, lowercaseStrBuiltIn);

	        System.out.println("Lowercase string (user-defined method): " + lowercaseStrUserDefined);
	        System.out.println("Lowercase string (built-in method): " + lowercaseStrBuiltIn);
	        System.out.println("Are the two lowercase strings equal? " + areEqual);
	    }
	
}
