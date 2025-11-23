package elementaryCodingPractices;
import java.util.Scanner;

public class CountEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int countEven = 0;

        System.out.println("Enter 5 numbers:");

        // Loop to read 5 numbers
        for (int i = 0; i < 5; i++) {
            int num = sc.nextInt();
            if (num % 2 == 0) {
                countEven++;
            }
        }

        System.out.println("Number of even numbers: " + countEven);

        sc.close();
    }

}
