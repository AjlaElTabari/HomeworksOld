package ba.BITCamp.ajla.Homework14;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {

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
	
			// asking user to define what number whants to find
			System.out.println("What number do you want to find?");
			int num = input.nextInt();
			// counting number and printing it on the std output
			System.out.println(countNumber(matrix, num));
			input.close();
		} catch (InputMismatchException e) {
			System.out.println("Wrong input");
		}
		
	}

	/**
	 * <b>Counts how many times chosen number is appearing in matrix </b>
	 * <p>
	 * Going through the matrix, finding desired number and increasing 
	 * counter by one every time when number appears.
	 * @param matrix two-dimensional array of integers
	 * @param number int number that we want to count
	 * @return int number that represents number of how many times chosen number is appearing in matrix
	 */
	public static int countNumber(int[][] matrix, int number) {
		int counter = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				counter += (matrix[i][j] == number) ? 1 : 0;
			}
		}
		return counter;
	}
}
