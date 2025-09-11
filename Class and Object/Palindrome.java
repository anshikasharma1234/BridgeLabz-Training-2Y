package javaclass;

public class Palindrome {
	 String text = "madam";

	    public boolean isPalindrome() {
	        String reversed = new StringBuilder(text).reverse().toString();
	        return text.equals(reversed);
	    }

	    public void displayResult() {
	        System.out.println("Text: " + text);
	        if (isPalindrome()) {
	            System.out.println("It is a palindrome.");
	        } else {
	            System.out.println("It is not a palindrome.");
	        }
	    }

	    public static void main(String[] args) {
	        Palindrome checker = new Palindrome();
	        checker.displayResult();
	    }
	}

