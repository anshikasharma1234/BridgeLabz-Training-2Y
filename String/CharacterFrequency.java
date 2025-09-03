package stringlevel3;

public class CharacterFrequency {
	 public static String[][] findCharacterFrequency(String str) {
	        int[] charFrequency = new int[256]; 
	        for (int i = 0; i < str.length(); i++) {
	            charFrequency[str.charAt(i)]++;
	        }
	        int count = 0;
	        for (int i = 0; i < 256; i++) {
	            if (charFrequency[i] > 0) {
	                count++;
	            }
	        }

	        String[][] result = new String[count][2];
	        int j = 0;
	        for (int i = 0; i < 256; i++) {
	            if (charFrequency[i] > 0) {
	                result[j][0] = String.valueOf((char) i);
	                result[j][1] = String.valueOf(charFrequency[i]);
	                j++;
	            }
	        }

	        return result;
	    }
	    public static void displayFrequencies(String[][] frequencies) {
	        System.out.println("Character\tFrequency");
	        for (String[] frequency : frequencies) {
	            System.out.println(frequency[0] + "\t\t" + frequency[1]);
	        }
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String inputStr = scanner.nextLine();

	        String[][] frequencies = findCharacterFrequency(inputStr);
	        displayFrequencies(frequencies);
	    }
}
