package stringlevel2;

public class VowelConsonantsFinder {
	 public static String checkCharacter(char c) {
	        if (c >= 'A' && c <= 'Z') {
	            c = (char) (c + 32);
	        }
	        if (c >= 'a' && c <= 'z') {
	            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
	                return "Vowel";
	            } else {
	                return "Consonant";
	            }
	        } else {
	            return "Not a Letter";
	        }}
	    public static String[][] findVowelsConsonants(String str) {
	        String[][] result = new String[str.length()][2];
	        for (int i = 0; i < str.length(); i++) {
	            result[i][0] = String.valueOf(str.charAt(i));
	            result[i][1] = checkCharacter(str.charAt(i));
	        }
	        return result;
	    }
	    public static void displayResult(String[][] result) {
	        System.out.println("Character\tType");
	        for (String[] row : result) {
	            System.out.println(row[0] + "\t\t" + row[1]);
	        }
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String inputStr = scanner.nextLine();

	        String[][] result = findVowelsConsonants(inputStr);

	        displayResult(result);
	    }
	}

