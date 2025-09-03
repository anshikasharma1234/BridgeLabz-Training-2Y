package stringlevel2;

public class VowelConsonantsCounter {
	 public static String checkCharacter(char c) {
	        if (c >= 'A' && c <= 'Z') {
	            c = (char) (c + 32); // Convert to lowercase
	        }
	        if (c >= 'a' && c <= 'z') {
	            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
	                return "Vowel";
	            } else {
	                return "Consonant";
	            }
	        } else {
	            return "Not a Letter";
	        }
	    }
	    public static int[] countVowelsConsonants(String str) {
	        int vowelCount = 0;
	        int consonantCount = 0;
	        for (int i = 0; i < str.length(); i++) {
	            String result = checkCharacter(str.charAt(i));
	            if (result.equals("Vowel")) {
	                vowelCount++;
	            } else if (result.equals("Consonant")) {
	                consonantCount++;
	            }
	        }
	        return new int[] { vowelCount, consonantCount };
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String inputStr = scanner.nextLine();
	        int[] counts = countVowelsConsonants(inputStr);
	        System.out.println("Vowel Count: " + counts[0]);
	        System.out.println("Consonant Count: " + counts[1]);
	    }
	}

