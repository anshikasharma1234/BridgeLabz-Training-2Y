package elementaryCodingPractices;
import java.util.Scanner;

public class Odd {
	public static void main(String[]args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter number :");
		int n = sc.nextInt();
		if(n%2!=0) {
			System.out.print("Number is Odd");
		}
		else if (n==0) {
			System.out.print("Number is Zero");
		}
		else {
			System.out.print("Number is not Odd");
		}
		sc.close();
	}
		
		
	}

