package stringlevel2;

public class StringLength {
	 public static int findLength(String str) {
	        int length = 0;
	        try {
	            while (true) {
	                str.charAt(length); length++;
	            }
	        } catch (StringIndexOutOfBoundsException e) {
	        }
	        return length;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String inputStr = scanner.next();
	        int lengthUserDefined = findLength(inputStr);
	        int lengthBuiltIn = inputStr.length();

	        System.out.println("Length of string (user-defined method): " + lengthUserDefined);
	        System.out.println("Length of string (built-in method): " + lengthBuiltIn);
	    }
	}

