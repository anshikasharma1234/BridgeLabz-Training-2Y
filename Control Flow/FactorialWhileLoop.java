package control_flow;

import java.util.Scanner;

public class FactorialWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();

        // Check if the number is valid
        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long factorial = 1; // use long to handle larger results
            int i = 1;

            // While loop to compute factorial
            while (i <= n) {
                factorial *= i;
                i++;
            }

            System.out.println("The factorial of " + n + " is " + factorial);
        }

        sc.close();
    }
}
