package stringlevel2;

public class SplitText {
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

	    public static String[] splitTextIntoWords(String str) {
	        int length = findLength(str);
	        int wordCount = 0;
	        for (int i = 0; i < length; i++) {
	            if (str.charAt(i) == ' ' && (i == 0 || str.charAt(i - 1) != ' ')) {
	                wordCount++;
	            }
	        }
	        if (length > 0 && str.charAt(length - 1) != ' ') {
	            wordCount++;
	        }

	        String[] words = new String[wordCount];
	        int wordIndex = 0;
	        int startIndex = 0;
	        for (int i = 0; i < length; i++) {
	            if (str.charAt(i) == ' ' && (i == 0 || str.charAt(i - 1) != ' ')) {
	                words[wordIndex++] = str.substring(startIndex, i);
	                startIndex = i + 1;
	            }
	        }
	        if (length > 0 && str.charAt(length - 1) != ' ') {
	            words[wordIndex] = str.substring(startIndex);
	        }

	        return words;
	    }

	    // Method to compare two string arrays
	    public static boolean compareStringArrays(String[] arr1, String[] arr2) {
	        if (arr1.length != arr2.length) {
	            return false;
	        }
	        for (int i = 0; i < arr1.length; i++) {
	            if (!arr1[i].equals(arr2[i])) {
	                return false;
	            }
	        }
	        return true;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String inputStr = scanner.nextLine();

	        String[] wordsUserDefined = splitTextIntoWords(inputStr);
	        String[] wordsBuiltIn = inputStr.trim().split("\\s+");

	        boolean areEqual = compareStringArrays(wordsUserDefined, wordsBuiltIn);

	        System.out.println("Words (user-defined method):");
	        for (String word : wordsUserDefined) {
	            System.out.println(word);
	        }

	        System.out.println("Words (built-in method):");
	        for (Arrays.toString(wordsBuiltIn).equals("[]")) {
	            System.out.println("No words found");
	        } else {
	            for (String word : wordsBuiltIn) {
	                System.out.println(word);
	            }
	        }

	        System.out.println("Are the two string arrays equal? " + areEqual);
	    }
	

}
