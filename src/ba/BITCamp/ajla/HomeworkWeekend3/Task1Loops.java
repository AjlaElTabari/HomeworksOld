package ba.BITCamp.ajla.HomeworkWeekend3;

import java.util.Scanner;

public class Task1Loops {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = input.nextInt();
		input.close();
		
		// Task 1.1
		System.out.println("Task 1 \nFormatted number is:");
		printOutFormattedNo(num);
		
		// Task 1.2
		System.out.println("Task 2 \nNumber of digits is:");
		System.out.println(getNumberOfDigits(num));
		
		// Task 1.3
		System.out.println("Task 3 \nSwitched first and last digit:");
		System.out.println(switchFirstAndLastDigit(num));
		
		// Task 1.4
		System.out.println("Task 4 \nNumbers in range are:");
		int num2 = switchFirstAndLastDigit(num);
		int range = numbersInRange(num, num2);
		if (range % 2 == 0) {
			for (int i = num; i < num2; i++) {
				if (i % 2 == 0) {
					System.out.println(i);
				}
			}
		} else {
			for (int i = num; i < num2; i++) {
				if (i % 2 != 0) {
					System.out.println(i);
				}
			}
		}
	}

	// Task 1.1
	public static void printOutFormattedNo(int number) {
		String num = number + "", resRev = "", res = "";
		int counter = 1;
		for (int i = num.length() - 1; i >= 0; i--) {
			if (counter != 3) {
				resRev += num.charAt(i);
				counter++;
			} else if (i == 0) {
				resRev += num.charAt(i);
			} else {
				resRev += num.charAt(i) + ",";
				counter = 1;
			}
		}
		
		for (int i = resRev.length() - 1; i >= 0; i--) {
			res += resRev.charAt(i);
		}
		System.out.println(res);
	}
	
	// Task 1.2
	public static int getNumberOfDigits (int n) {
		String num = n + "";
		return num.length();
	}
	
	// Task 1.3
	public static int switchFirstAndLastDigit (int n) {
		String num = n + "", first = "", last = "", newNum = "";
		first = num.charAt(0) + "";
		last = num.charAt(num.length() - 1) + "";
		for (int i = 0; i < num.length(); i++) {
			if (i == 0) {
				newNum += last;
			} else if (i == num.length() - 1) {
				newNum += first;
			} else {
				newNum += num.charAt(i);
			}
		}
		return Integer.parseInt(newNum);
	}
	
	// Task 1.4
	public static int numbersInRange (int num1, int num2) {
		int counter = 0;
		for (int i = num1; i < num2; i++) {
			counter++;
		}
		return counter;
	}
}
