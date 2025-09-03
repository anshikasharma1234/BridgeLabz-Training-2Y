package stringlevel3;

public class AnagramCheaker {
	public static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        int[] charCount = new int[256]; 
        for (char c : str1.toLowerCase().toCharArray()) {
            charCount[c]++;
        }
        for (char c : str2.toLowerCase().toCharArray()) {
            charCount[c]--;
        }
        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();

        if (!str1.matches("[a-zA-Z ]+") || !str2.matches("[a-zA-Z ]+")) {
            System.out.println("INVALID CHARACTERS IN STRING. INVALID INPUT");
            return;
        }
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        if (areAnagrams(str1, str2)) {
            System.out.println("THEY ARE ANAGRAMS!");
        } else {
            System.out.println("THEY ARE NOT ANAGRAMS.");
        }
    }
    
}
