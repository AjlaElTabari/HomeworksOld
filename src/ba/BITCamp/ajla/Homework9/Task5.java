package ba.BITCamp.ajla.Homework9;

import java.util.Arrays;
import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("How long your array should be?");
		int arrayL = input.nextInt();
		String[] arr = new String[arrayL];
		
		System.out.println("Enter array elements");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = input.nextLine();
		}
		
		int[] countArr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			String str = arr[i];
			for (int j = 0; j < str.length(); j++) {
				char potentialNum = str.charAt(j);
				switch (potentialNum) {
				case '0':
					countArr[0]++;
					break;
				case '1':
					countArr[1]++;
					break;
				case '2':
					countArr[2]++;
					break;
				case '3':
					countArr[3]++;
					break;
				case '4':
					countArr[4]++;
					break;
				case '5':
					countArr[5]++;
					break;
				case '6':
					countArr[6]++;
					break;
				case '7':
					countArr[7]++;
					break;
				case '8':
					countArr[8]++;
					break;
				case '9':
					countArr[9]++;
					break;
				}
			}
		}
		  System.out.println(Arrays.toString(countArr));
		  input.close();
	}

}
