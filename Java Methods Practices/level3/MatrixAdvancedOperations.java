package level3;

import java.util.Random;
import java.util.Scanner;
public class MatrixAdvancedOperations {
	    public static double[][] generateRandomMatrix(int rows, int cols) {
	        Random rand = new Random();
	        double[][] matrix = new double[rows][cols];
	        for (int i = 0; i < rows; i++)
	            for (int j = 0; j < cols; j++)
	                matrix[i][j] = 1 + rand.nextInt(10); 
	        return matrix;
	    }
	    public static void displayMatrix(double[][] matrix) {
	        for (double[] row : matrix) {
	            for (double val : row) {
	                System.out.printf("%.2f\t", val);
	            }
	            System.out.println();
	        }
	    }
	    public static double[][] transpose(double[][] matrix) {
	        int rows = matrix.length;
	        int cols = matrix[0].length;
	        double[][] trans = new double[cols][rows];
	        for (int i = 0; i < rows; i++)
	            for (int j = 0; j < cols; j++)
	                trans[j][i] = matrix[i][j];
	        return trans;
	    }
	    public static double determinant2x2(double[][] matrix) {
	        return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
	    }
	    public static double determinant3x3(double[][] m) {
	        return m[0][0]*(m[1][1]*m[2][2] - m[1][2]*m[2][1])
	             - m[0][1]*(m[1][0]*m[2][2] - m[1][2]*m[2][0])
	             + m[0][2]*(m[1][0]*m[2][1] - m[1][1]*m[2][0]);
	    }

	    // Inverse of 2x2 matrix
	    public static double[][] inverse2x2(double[][] m) {
	        double det = determinant2x2(m);
	        if (det == 0) {
	            System.out.println("Matrix is singular, inverse not possible.");
	            return null;
	        }
	        double[][] inv = new double[2][2];
	        inv[0][0] = m[1][1]/det;
	        inv[0][1] = -m[0][1]/det;
	        inv[1][0] = -m[1][0]/det;
	        inv[1][1] = m[0][0]/det;
	        return inv;
	    }
	    public static double[][] inverse3x3(double[][] m) {
	        double det = determinant3x3(m);
	        if (det == 0) {
	            System.out.println("Matrix is singular, inverse not possible.");
	            return null;
	        }
	        double[][] inv = new double[3][3];
	        inv[0][0] =  (m[1][1]*m[2][2] - m[1][2]*m[2][1])/det;
	        inv[0][1] = -(m[0][1]*m[2][2] - m[0][2]*m[2][1])/det;
	        inv[0][2] =  (m[0][1]*m[1][2] - m[0][2]*m[1][1])/det;

	        inv[1][0] = -(m[1][0]*m[2][2] - m[1][2]*m[2][0])/det;
	        inv[1][1] =  (m[0][0]*m[2][2] - m[0][2]*m[2][0])/det;
	        inv[1][2] = -(m[0][0]*m[1][2] - m[0][2]*m[1][0])/det;

	        inv[2][0] =  (m[1][0]*m[2][1] - m[1][1]*m[2][0])/det;
	        inv[2][1] = -(m[0][0]*m[2][1] - m[0][1]*m[2][0])/det;
	        inv[2][2] =  (m[0][0]*m[1][1] - m[0][1]*m[1][0])/det;

	        return transpose(inv);
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter size of matrix (2 or 3): ");
	        int n = sc.nextInt();
	        if (n != 2 && n != 3) {
	            System.out.println("Only 2x2 or 3x3 matrices are supported.");
	            sc.close();
	            return;
	        }

	        double[][] matrix = generateRandomMatrix(n, n);

	        System.out.println("\nOriginal Matrix:");
	        displayMatrix(matrix);
	        double[][] trans = transpose(matrix);
	        System.out.println("\nTranspose:");
	        displayMatrix(trans);
	        double det = (n == 2) ? determinant2x2(matrix) : determinant3x3(matrix);
	        System.out.printf("\nDeterminant: %.2f\n", det);
	        double[][] inv = (n == 2) ? inverse2x2(matrix) : inverse3x3(matrix);
	        if (inv != null) {
	            System.out.println("\nInverse:");
	            displayMatrix(inv);
	        }

	        sc.close();
	    
	}

}
