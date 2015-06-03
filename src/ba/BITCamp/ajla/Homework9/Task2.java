package ba.BITCamp.ajla.Homework9;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int[] arr1 = new int[5];
		int[] arr2 = new int[5];
		
		System.out.println("Enter first array");
		for(int i = 0; i < arr1.length; i++) {
			arr1[i] = input.nextInt();
		}
		
		System.out.println("Enter second array");
		for(int i = 0; i < arr2.length; i++) {
			arr2[i] = input.nextInt();
		}
		
		boolean identical = true;
		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr2.length; j++) {
				if (arr1[i] != arr2[i]) {
					identical = false;
				} 
			}
		}
		
		if (identical) {
			System.out.println("Arrays are identical.");
		} else {
			System.out.println("Arrays are NOT identical.");
		}
		input.close();

	}

}
