package level3;

import java.util.Random;
import java.util.Scanner;

public class MatrixOperations {

	    public static int[][] generateRandomMatrix(int rows, int cols) {
	        Random rand = new Random();
	        int[][] matrix = new int[rows][cols];
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                matrix[i][j] = 1 + rand.nextInt(9);
	            }
	        }
	        return matrix;
	    }

	    public static int[][] addMatrices(int[][] A, int[][] B) {
	        int rows = A.length;
	        int cols = A[0].length;
	        int[][] result = new int[rows][cols];
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                result[i][j] = A[i][j] + B[i][j];
	            }
	        }
	        return result;
	    }

	    public static int[][] subtractMatrices(int[][] A, int[][] B) {
	        int rows = A.length;
	        int cols = A[0].length;
	        int[][] result = new int[rows][cols];
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                result[i][j] = A[i][j] - B[i][j];
	            }
	        }
	        return result;
	    }

	    public static int[][] multiplyMatrices(int[][] A, int[][] B) {
	        int rowsA = A.length;
	        int colsA = A[0].length;
	        int colsB = B[0].length;
	        int[][] result = new int[rowsA][colsB];

	        for (int i = 0; i < rowsA; i++) {
	            for (int j = 0; j < colsB; j++) {
	                for (int k = 0; k < colsA; k++) {
	                    result[i][j] += A[i][k] * B[k][j];
	                }
	            }
	        }
	        return result;
	    }

	    public static void displayMatrix(int[][] matrix) {
	        for (int[] row : matrix) {
	            for (int val : row) {
	                System.out.print(val + "\t");
	            }
	            System.out.println();
	        }
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter rows and columns for Matrix A: ");
	        int rowsA = sc.nextInt();
	        int colsA = sc.nextInt();

	        System.out.print("Enter rows and columns for Matrix B: ");
	        int rowsB = sc.nextInt();
	        int colsB = sc.nextInt();

	        int[][] matrixA = generateRandomMatrix(rowsA, colsA);
	        int[][] matrixB = generateRandomMatrix(rowsB, colsB);

	        System.out.println("\nMatrix A:");
	        displayMatrix(matrixA);

	        System.out.println("\nMatrix B:");
	        displayMatrix(matrixB);

	        if (rowsA == rowsB && colsA == colsB) {
	            System.out.println("\nA + B:");
	            displayMatrix(addMatrices(matrixA, matrixB));

	            System.out.println("\nA - B:");
	            displayMatrix(subtractMatrices(matrixA, matrixB));
	        } else {
	            System.out.println("\nAddition and Subtraction not possible due to different dimensions.");
	        }

	        if (colsA == rowsB) {
	            System.out.println("\nA x B:");
	            displayMatrix(multiplyMatrices(matrixA, matrixB));
	        } else {
	            System.out.println("\nMultiplication not possible due to incompatible dimensions.");
	        }

	        sc.close();
	    }
	}


