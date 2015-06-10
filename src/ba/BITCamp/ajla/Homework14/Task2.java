package ba.BITCamp.ajla.Homework14;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		try {
			// declaration and initialization variables
			// asking user to define desired matrix size and to enter its values
			Scanner input = new Scanner(System.in);
			int rows = 0, cols = 0;
			System.out.println("\nPlease enter the size of desired matrix");
			System.out.println("How many rows your matrix will have?");
			rows = input.nextInt();
			System.out.println("How many columns your matrix will have?");
			cols = input.nextInt();

			int[][] matrix = new int[rows][cols];

			// calling a method for fulfilling 2D array from the ArraysHelper
			ArraysHelper.fill2DArrayFromTheConsole(matrix);
			
			// declaring and initializing counter to count rows and columns that have sum = 0
			int counter = 0;
			// for every row in matrix we are calculating its sum, and if it is 0, increasing counter by one
	 		for (int i = 0; i < matrix.length; i++) {
				if (getRowsSum(matrix, i)) {
					counter++;
				}
			}
			// for every column in matrix we are calculating its sum, and if it is 0, increasing counter by one
	 		for (int i = 0; i < matrix.length; i++) {
				if (getColmSum(matrix, i)) {
					counter++;
				}
			}
	 		
	 		// printing out the counter, that represents number of rows and columns that have sum = 0;
	 		System.out.print("Number of rows and columns that have sum = 0 is: ");
	 		System.out.println(counter);
	 		
	 		input.close();
		} catch (InputMismatchException e) {
			System.out.println("Wrong input");
		}
		
	}
	
	/**
	 * <b>Checking if sum of provided row in matrix is zero </b>
	 * @param arr two-dimensional array of ints
	 * @param col column from the matrix that we want to check
	 * @return true if sum of provided column is zero, and false if it is not
	 */
	public static boolean getColmSum (int[][] arr, int col) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i][col];
		}
		return (sum == 0) ? true : false;
	}
	
	/**
	 * <b>Checking if sum of provided row in matrix is zero </b>
	 * @param arr two-dimensional array of ints
	 * @param row from the matrix that we want to check
	 * @return true if sum of provided row is zero, and false if it is not
	 */
	public static boolean getRowsSum (int[][] arr, int row) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[row][i];
		}
		return (sum == 0) ? true : false;
	}

}
