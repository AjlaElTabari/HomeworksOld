package ba.BITCamp.ajla.Homework14;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		try {
			// declaration and initialization variables
			// asking user to define desired matrix size and to enter its values
			Scanner input = new Scanner(System.in);
			int rows = 3, cols = 3;
			System.out.println("\nPlease enter your 3x3 matrix");

			int[][] matrix = new int[rows][cols];

			// calling a method for fulfilling 2D array from the ArraysHelper
			ArraysHelper.fill2DArrayFromTheConsole(matrix);
			ArraysHelper.print2DArray(matrix);
			

			System.out.println("\nPlease enter the location where your jumper is standing, in format.");
			System.out.println("Enter the row");
			int rowIndex = input.nextInt();
			System.out.println("Enter the column");
			int columnIndex = input.nextInt();

			System.out.print("\nMaximun number of point that jumper can collect in one move is: ");
			System.out.println(getMaxPoints(matrix, rowIndex, columnIndex));
			
			input.close();
		} catch (InputMismatchException e) {
			System.out.println("Wrong input");
		}
	}

	/**
	 * <b>Calculating maximum number of points that jumper can collect in one move</b>
	 * <p>
	 * Simulating one move of jumper in Chess. Calculating what is the maximum number 
	 * of points that jumper can collect from the position where it is standing
	 * @param matrix 2D array (3x3) that represents Chess board with points collected from user
	 * @param x index of row
	 * @param y index of column
	 * @return int number that represents maximum number of collected points
	 */
	public static int getMaxPoints(int[][] matrix, int x, int y) {
		int res = 0;
		if (x == 0 && y == 0) {
			res = (matrix[1][2] > matrix[2][1]) ? matrix[1][2] : matrix[2][1];			
		}
		if (x == 0 && y == 1) {
			res = (matrix[2][2] > matrix[2][0]) ? matrix[2][2] : matrix[2][0];			
		}
		if (x == 0 && y == 2) {
			res = (matrix[2][1] > matrix[1][0]) ? matrix[2][1] : matrix[1][0];			
		}
		if (x == 1 && y == 0) {
			res = (matrix[0][2] > matrix[2][2]) ? matrix[0][2] : matrix[2][2];			
		}
		if (x == 1 && y == 1) {
			res = matrix[1][1];			
		}
		if (x == 1 && y == 2) {
			res = (matrix[0][0] > matrix[2][0]) ? matrix[0][0] : matrix[2][0];			
		}
		if (x == 2 && y == 0) {
			res = (matrix[0][1] > matrix[1][2]) ? matrix[0][1] : matrix[1][2];			
		}
		if (x == 2 && y == 1) {
			res = (matrix[0][0] > matrix[0][2]) ? matrix[0][0] : matrix[0][2];			
		}
		if (x == 2 && y == 2) {
			res = (matrix[1][0] > matrix[0][1]) ? matrix[1][0] : matrix[0][1];			
		}
		return res;
	}
}
