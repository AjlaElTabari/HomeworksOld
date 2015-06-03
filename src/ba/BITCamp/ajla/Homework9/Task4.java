package ba.BITCamp.ajla.Homework9;

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		char[] arr1 = {'I', 'N', 'G', 'B', 'I', 'T', 'C', 'A', 'M', 'P'};

		System.out.println("Enter shifting value");
		int shift = input.nextInt();
		
		if (shift == 0) {
			System.out.println("You entered 0. There is no need to shift anything.");
		} else if (shift > 0) {
			shiftRight(arr1, shift);
		} else {
			shiftLeft(arr1, shift);
		}
		
		input.close();
	}
	 public static void shiftRight( char[] arr, int shift )
	  { 
		 int timesShifted = 0;
		 while (timesShifted < shift) {
	     char last = arr[arr.length-1]; 
	        for( int index = arr.length-2; index >= 0 ; index-- ){
	        	arr[index + 1] = arr [index];
	        }
	        arr[0] = last;
	        timesShifted++;
		 }
	    System.out.println(Arrays.toString(arr));
	  }
	
	 public static void shiftLeft( char[] arr, int shift )
	  {
		 int timesShifted = 0;
		 while (timesShifted < -1 * shift) {
			 char temp = arr[0];
			 for (int i = 0; i < arr.length - 1; i++) {
				 arr[i] = arr[i + 1];
			 }
			 arr[arr.length - 1] = temp;
			 timesShifted++;
		 }
		 System.out.println(Arrays.toString(arr));
	  }
}
