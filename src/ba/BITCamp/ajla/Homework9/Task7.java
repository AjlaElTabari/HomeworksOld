package ba.BITCamp.ajla.Homework9;

import java.util.Arrays;
import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int[] arr = new int[100000];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 100000);
		}
		
		Arrays.sort(arr);
		
		System.out.println("What number do you want to find?");
		int num = input.nextInt();
		
		// binarySearch
		long beggining = System.currentTimeMillis();
		Arrays.binarySearch(arr, num);
		long ended = System.currentTimeMillis() - beggining;
		System.out.println("Using binarySearch method, it took " + ended + " millis to find the number.");
		
		// sequential method
		beggining = System.currentTimeMillis();
		for (int i = 0; i < arr.length; i++) {
			if(num == arr[i]){
				break;
			}
		}
		ended = System.currentTimeMillis() - beggining;
		System.out.println("Using sequential method, it took " + ended + " millis to find the number.");
		
		input.close();

	}

}
