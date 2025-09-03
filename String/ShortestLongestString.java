package stringlevel2;

public class ShortestLongestString {
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

	    // Method to get word lengths
	    public static String[][] getWordLengths(String[] words) {
	        String[][] wordLengths = new String[words.length][2];
	        for (int i = 0; i < words.length; i++) {
	            wordLengths[i][0] = words[i];
	            wordLengths[i][1] = String.valueOf(findLength(words[i]));
	        }
	        return wordLengths;
	    }
	    public static int[] findShortestLongest(String[][] wordLengths) {
	        int shortestIndex = 0;
	        int longestIndex = 0;
	        for (int i = 1; i < wordLengths.length; i++) {
	            int currentLength = Integer.parseInt(wordLengths[i][1]);
	            int shortestLength = Integer.parseInt(wordLengths[shortestIndex][1]);
	            int longestLength = Integer.parseInt(wordLengths[longestIndex][1]);

	            if (currentLength < shortestLength) {
	                shortestIndex = i;
	            }
	            if (currentLength > longestLength) {
	                longestIndex = i;
	            }
	        }
	        return new int[] { shortestIndex, longestIndex };
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String inputStr = scanner.nextLine();

	        String[] words = splitTextIntoWords(inputStr);

	        
	        String[][] wordLengths = getWordLengths(words);

	        int[] indices = findShortestLongest(wordLengths);

	        System.out.println("Shortest string: " + wordLengths[indices[0]][0] + " (Length: " + wordLengths[indices[0]][1] + ")");
	        System.out.println("Longest string: " + wordLengths[indices[1]][0] + " (Length: " + wordLengths[indices[1]][1] + ")");
	    }
	}
