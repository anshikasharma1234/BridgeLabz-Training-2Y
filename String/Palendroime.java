package stringlevel3;

public class Palendroime {
	  public static boolean isPalindrome(String text) {
	        int start = 0;
	        int end = text.length() - 1;
	        while (start < end) {
	            if (text.charAt(start) != text.charAt(end)) {
	                return false;
	            }
	            start++;
	            end--;
	        }
	        return true;
	    }

	    public static void main(String[] args) {
	        String text = "madam";
	        System.out.println(isPalindrome(text)); // true
	    }
	

}
