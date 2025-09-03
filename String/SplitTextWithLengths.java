package stringlevel2;

public class SplitTextWithLengths {
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
	    public static String[][] getWordLengths(String[] words) {
	        String[][] wordLengths = new String[words.length][2];
	        for (int i = 0; i < words.length; i++) {
	            wordLengths[i][0] = words[i];
	            wordLengths[i][1] = String.valueOf(findLength(words[i]));
	        }
	        return wordLengths;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String inputStr = scanner.nextLine();
	        String[] words = splitTextIntoWords(inputStr);
	        String[][] wordLengths = getWordLengths(words);
	        System.out.println("Word\tLength");
	        for (String[] wordLength : wordLengths) {
	            System.out.println(wordLength[0] + "\t" + Integer.parseInt(wordLength[1]));
	        }
	    }
	
}
