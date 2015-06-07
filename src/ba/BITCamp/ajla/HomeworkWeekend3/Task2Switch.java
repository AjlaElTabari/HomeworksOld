package ba.BITCamp.ajla.HomeworkWeekend3;

import java.util.Scanner;

public class Task2Switch {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What time is it? (enter full our)");
		int time = input.nextInt();
		input.close();
		
		switch (time) {
		case 9:
		case 10:
		case 11:
		case 12:
			System.out.println("Lectures.");
			break;
		case 13: 
			System.out.println("Break! woohoo");
			break;
		case 14: 
		case 15:
		case 16:
			System.out.println("Excercises.");
			break;
		case 17:
			System.out.println("Foood!");
			break;
		case 18:
		case 19:
		case 20:
		case 21:
		case 22:
		case 23:
		case 24:
			System.out.println("Homework");
			break;
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
			System.out.println("Shhh sleeping");
			break;
		}

	}

}
