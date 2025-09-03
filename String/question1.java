package stringlevel_1;

import java.util.Scanner;
public class question1 {
    public static boolean compareWithCharAt(String str1, String str2) {
    
        if (str1.length() != str2.length()) {
            return false;
        }
        
        // Compare each character using charAt()
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first string: ");
        String string1 = scanner.next();
        
        System.out.print("Enter second string: ");
        String string2 = scanner.next();
        
        boolean charAtResult = compareWithCharAt(string1, string2);
        
        boolean equalsResult = string1.equals(string2);
        
        System.out.println("\nComparison Results:");
        System.out.println("Using charAt() method: " + (charAtResult ? "Strings are equal" : "Strings are not equal"));
        System.out.println("Using equals() method: " + (equalsResult ? "Strings are equal" : "Strings are not equal"));
        
        if (charAtResult == equalsResult) {
            System.out.println("✓ Both methods produced the same result!");
        } else {
            System.out.println("✗ Methods produced different results!");
        }
        
        scanner.close();
    }
}