package ba.BITCamp.ajla.Homeworks.Benjamin;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		while (true) {
			try {
				System.out
						.print("Molim unesite aritmeticki izraz u obliku:  a + b + c - d / f * g...");
				String expression = input.nextLine();
				String sNum = "";
				int num = 0;
				int result = 0;
				char operator1 = '0';
				char operator2 = '0';

				for (int j = 0; j < expression.length(); j++) {
					if (expression.charAt(j) == '+'
							|| expression.charAt(j) == '-'
							|| expression.charAt(j) == '*'
							|| expression.charAt(j) == '/') {
						operator2 = expression.charAt(j);
						num = Integer.parseInt(sNum.trim());
						sNum = "";
						if (operator1 == '0') {
							result = num;
						} else if (operator1 == '+') {
							result += num;
						} else if (operator1 == '-') {
							result -= num;
						} else if (operator1 == '*') {
							result *= num;
						} else if (operator1 == '/') {
							result /= num;
						}
						operator1 = operator2;
					} else {
						sNum += expression.charAt(j);
					}
				}
				num = Integer.parseInt(sNum.trim());
				if (operator1 == '+') {
					result += num;
				} else if (operator1 == '-') {
					result -= num;
				} else if (operator1 == '*') {
					result *= num;
				} else if (operator1 == '/') {
					result /= num;
				}

				System.out.println("Result is: " + result);

				input.close();
				break;

			} catch (NumberFormatException e) {
				System.out.println("Pogresan unos!");
			}
		}

	}

}
