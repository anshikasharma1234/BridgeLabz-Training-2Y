package stringlevel2;

public class TrimString {
	 public static int[] trim(String str) {
	        int start = 0;
	        int end = str.length() - 1;

	        // Trim leading spaces
	        while (start <= end && str.charAt(start) == ' ') {
	            start++;
	        }

	        while (start <= end && str.charAt(end) == ' ') {
	            end--;
	        }

	        return new int[] { start, end };
	    }
	    public static String substring(String str, int start, int end) {
	        StringBuilder sb = new StringBuilder();
	        for (int i = start; i <= end; i++) {
	            sb.append(str.charAt(i));
	        }
	        return sb.toString();
	    }

	    // Method to compare two strings
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
	        int[] indices = trim(inputStr);
	        String trimmedStrUserDefined = substring(inputStr, indices[0], indices[1]);
	        String trimmedStrBuiltIn = inputStr.trim();
	        boolean areEqual = compareStrings(trimmedStrUserDefined, trimmedStrBuiltIn);

	        System.out.println("Trimmed string (user-defined method): " + trimmedStrUserDefined);
	        System.out.println("Trimmed string (built-in method): " + trimmedStrBuiltIn);
	        System.out.println("Are the two strings equal? " + areEqual);
	    }
	}

