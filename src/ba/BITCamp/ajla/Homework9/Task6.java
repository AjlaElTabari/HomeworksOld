package ba.BITCamp.ajla.Homework9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int arrayL = 0;
		try {
			System.out.println("Enter array length");
			arrayL = input.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Wrong input!");
		}
		
		int[] newArray = null;
		try {
			newArray = new int[arrayL];
		} catch (NegativeArraySizeException e) {
			System.out.println("Array size cannot be a negative number!");
		}
				
		try {
			System.out.println("Enter array members");
			for (int i = 0; i < newArray.length; i++) {
				newArray[i] = input.nextInt();	
			}
		} catch (NullPointerException e) {
			System.out.println("Array cannot be null");
		}
		
		System.out.println("What number do you want to find?");
		int q = input.nextInt();
		
		boolean exists = false;
		for (int i = 0; i < newArray.length; i++) {
			if (newArray [i] == q) {
				exists = true;
			}
		}
		System.out.println(exists);
		input.close();
		
	}

}
