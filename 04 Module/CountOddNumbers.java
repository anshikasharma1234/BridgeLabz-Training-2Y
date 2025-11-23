package elementaryCodingPractices;
import java.util.Scanner;

public class CountOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int countOdd = 0;

        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < 5; i++) {
            int num = sc.nextInt();
            if (num % 2 != 0) {  // Check if the number is odd
                countOdd++;
            }
        }

        System.out.println("Number of odd numbers: " + countOdd);

        sc.close();
    }

}
