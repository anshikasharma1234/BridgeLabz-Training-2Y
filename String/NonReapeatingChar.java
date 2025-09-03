package stringlevel3;

public class NonReapeatingChar {
	 public static char findFirstNonRepeatingChar(String str) {
	        int[] charFrequency = new int[256];
	        for (int i = 0; i < str.length(); i++) {
	            charFrequency[str.charAt(i)]++;
	        }
	        for (int i = 0; i < str.length(); i++) {
	            if (charFrequency[str.charAt(i)] == 1) {
	                return str.charAt(i);
	            }}
	        return '\0';
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String inputStr = scanner.nextLine();

	        char firstNonRepeatingChar = findFirstNonRepeatingChar(inputStr);
	        if (firstNonRepeatingChar != '\0') {
	            System.out.println("First non-repeating character: " + firstNonRepeatingChar);
	        } else {
	            System.out.println("No non-repeating character found.");
	        }
	    }
	
}
