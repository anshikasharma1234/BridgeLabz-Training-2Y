package elementaryCodingPractices;
import java.util.Scanner;

public class CountEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int countEven = 0;
        int countOdd = 0;

        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < 5; i++) {
            int num = sc.nextInt();
            if (num % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }

        System.out.println("Number of even numbers: " + countEven);
        System.out.println("Number of odd numbers: " + countOdd);

        sc.close();
    }
}
