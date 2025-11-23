package elementaryCodingPractices;
import java.util.Scanner;

public class LastDigit {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int n = sc.nextInt();

   
    int lastDigit = Math.abs(n) % 10;  
    System.out.println("The last digit is: " + lastDigit);

    sc.close();
}

