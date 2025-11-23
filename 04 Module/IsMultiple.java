package elementaryCodingPractices;
import java.util.Scanner;

public class IsMultiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int N = sc.nextInt();

        System.out.print("Enter the value of M: ");
        int M = sc.nextInt();

        if (M != 0 && N % M == 0) {
            System.out.println(N + " is an exact multiple of " + M);
        } else if (M == 0) {
            System.out.println("Division by zero is not allowed.");
        } else {
            System.out.println(N + " is not an exact multiple of " + M);
        }

        sc.close();
    }

}
