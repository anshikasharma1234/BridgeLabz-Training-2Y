package programming_element2;

import java.util.Scanner;

public class question_7 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter value of a: ");
	        int a = sc.nextInt();

	        System.out.print("Enter value of b: ");
	        int b = sc.nextInt();

	        System.out.print("Enter value of c: ");
	        int c = sc.nextInt();
	        int result1 = a + b * c;
	        int result2 = a * b + c;
	        int result3 = c + a / b;
	        int result4 = a % b + c;

	    }}