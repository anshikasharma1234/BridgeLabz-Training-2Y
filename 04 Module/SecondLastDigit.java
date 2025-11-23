package elementaryCodingPractices;
import java.util.Scanner;

public class SecondLastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int absNumber = Math.abs(n);

        
        int secondLastDigit = (absNumber / 10) % 10;

        System.out.println("The second last digit is: " + secondLastDigit);

        sc.close();
    }
	

}
