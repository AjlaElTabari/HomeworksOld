package ba.BITCamp.ajla.Homework9;

import java.util.Scanner;

public class Task3 {
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
		
		if(compareArrays(arr1, arr2)) {
			System.out.println("Arrays are identical.");
		} else {
			System.out.println("Arrays are NOT identical.");
		}
		
		input.close();
	}
	
	public static boolean compareArrays(int[] arr1, int[] arr2) {
	    if (arr1 == null || arr2 == null) {
	        return false;
	    }
	    if (arr1.length != arr2.length) {
	        return false;
	    }

	    int[] sortedArr1 = sortArray(arr1);
	    int[] sortedArr2 = sortArray(arr2);

	    for (int i = 0; i < sortedArr1.length-1; i++) {
	        if(sortedArr1[i] != sortedArr2[i]) {
	            return false;
	        }
	    }
	     return true;
	}
	
	public static void swapElements(int[] arr, int pos){
	    int temp = arr[pos];
	    arr[pos] = arr[pos+1];
	    arr[pos+1] = temp;
	}
	
	public static int[] sortArray(int[] arr){
	    for (int k = 0; k < arr.length; k++) {
	        for (int i = 0; i < arr.length-1; i++) {
	            if(arr[i]>arr[i+1]){
	                swapElements(arr,i);
	            }
	        }
	    }
	    return arr;
	}
}
