package ba.BITCamp.ajla.Homework13;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter temperatures in Celsius");
		float celsius = input.nextFloat();
		System.out.printf("%.2fC = %.2fK", celsius, convertToKelvins(celsius));
	}
	
	/**
	 * Calculates temperature in Kelvins, based on temperature in Celsius, that is provided as argument
	 * @param celsius - temperature in Celsius, double value
	 * @return temperature in Kelvins, double value
	 */
	public static double convertToKelvins (double celsius) {
		 double kelvins = 0.0;
		return kelvins = celsius + 273.15;
	}
}
