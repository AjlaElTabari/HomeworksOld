package ba.BITCamp.ajla.HomeworkWeekend3;

import java.util.Arrays;
import java.util.Scanner;

public class Task5Arrays {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		System.out.println("How long your array should be?");
		int maxLength1 = input.nextInt();
		
		int [] arr1 = new int [maxLength1];
				
		for (int i = 0; i < arr1.length; i++){
			System.out.println("Enter array member");
			arr1[i] = input.nextInt();
		}
		input.close();
		
		System.out.println("How long your another array should be?");
		int maxLength2 = input.nextInt();
		
		int [] arr2 = new int [maxLength2];
				
		for (int i = 0; i < arr2.length; i++){
			System.out.println("Enter array member");
			arr2[i] = input.nextInt();
		}
		
		
		// Task 5.1
		System.out.println("Task 5.1");
		System.out.println("Are those arrays identical?");
		//System.out.println(areArraysIdentical(arr1, arr2));
		
		// Task 5.2
		System.out.println("Task 5.2");
		System.out.println("Add members of arrays that are on same positions");
		System.out.println(Arrays.toString(addMembersOfTwoArrays(arr1, arr2)));
		
		// Task 5.3
		System.out.println("Task 5.3");
		System.out.println("Join two arrays");
		System.out.println(Arrays.toString(joinTwoArrays(arr1, arr2)));

	}
	
	// Task 5.1
	public static boolean areArraysIdentical (int[] arr1, int[] arr2) {
		boolean identical = true;
		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr2.length; j++) {
				if (arr1[i] != arr2[i]) {
					identical = false;
				} 
			}
		}
		return identical;
	}
	
	// Task 5.2
	public static int[] addMembersOfTwoArrays (int[] arr1, int[] arr2) {		
				
		int l1 = arr1.length;
		int l2 = arr2.length;
		
		int[] arrRes = null;
		
		if (l1 > l2) {
			arrRes = new int[l1];
			arr2 = Arrays.copyOf(arr2, l1); 
			
			for(int i = 0; i < l1; i++) {
				arrRes[i] = arr1[i] + arr2[i];
			}
			
		} else if(l1 < l2) {
			arrRes = new int[l2];
			arr1 = Arrays.copyOf(arr1, l2); 
			
			for(int i = 0; i < l2; i++) {
				arrRes[i] = arr1[i] + arr2[i];
			}
		} else {
			for(int i = 0; i < l1; i++) {
				arrRes = new int[l1];
				arrRes[i] = arr1[i] + arr2[i];
			}
		}
		return arrRes;
	}
	
	// Task 5.3
	public static int[] joinTwoArrays (int [] array1, int [] array2){
		int l1 = array1.length;
		int l2 = array2.length;
		int l = l1 + l2;
		
		int[] newArray = new int[l];
		for (int i = 0; i < l1; i++){
			newArray[i] = array1[i];
		}
		int counter = 0;
			for (int i = l1; i < l; i++){
				newArray[i] = array2[counter];
				counter++;
			}
		return newArray;
	}
	
}
