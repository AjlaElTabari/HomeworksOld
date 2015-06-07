package ba.BITCamp.ajla.HomeworkWeekend3;

import java.util.Arrays;
import java.util.Scanner;

public class Task6ASmallGame {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println(Arrays.toString(returnArrayFilledWithRandomValues()));
		input.close();

	}

	public static int[] returnArrayFilledWithRandomValues() {
		int[] arr = new int[5];
		for (int i = 0; i < 5; i++) {
			arr[i] = (int)(Math.random()*5);
		}
		return arr;
 	}
}
