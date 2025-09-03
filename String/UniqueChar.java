package stringlevel3;

public class UniqueChar {
	 public static int findLength(String str) {
	        int length = 0;
	        try {
	            while (true) {
	                str.charAt(length);
	                length++;
	            }
	        } catch (StringIndexOutOfBoundsException e) {
	        }
	        return length;
	    }
	    public static char[] findUniqueCharacters(String str) {
	        int length = findLength(str);
	        char[] uniqueChars = new char[length];
	        int uniqueCount = 0;

	        for (int i = 0; i < length; i++) {
	            boolean isUnique = true;
	            for (int j = 0; j < uniqueCount; j++) {
	                if (str.charAt(i) == uniqueChars[j]) {
	                    isUnique = false;
	                    break;
	                }
	            }
	            if (isUnique) {
	                uniqueChars[uniqueCount++] = str.charAt(i);
	            }
	        }
	        char[] result = new char[uniqueCount];
	        System.arraycopy(uniqueChars, 0, result, 0, uniqueCount);
	        return result;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String inputStr = scanner.nextLine();

	        char[] uniqueChars = findUniqueCharacters(inputStr);
	        System.out.println("Unique characters: " + new String(uniqueChars));
	    }
	}


}
